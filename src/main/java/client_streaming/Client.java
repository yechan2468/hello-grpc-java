package client_streaming;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        ClientCaller clientCaller = new ClientCaller(channel);
        clientCaller.requestCountMessages();
    }
}

class ClientCaller {

    private final ClientStreamingGrpc.ClientStreamingStub asyncStub;

    private final String[] messages = {
            "message #1",
            "message #2",
            "message #3",
            "message #4",
            "message #5"
    };

    public ClientCaller(ManagedChannel chl) {
        asyncStub = ClientStreamingGrpc.newStub(chl);
    }

    public void requestCountMessages() throws InterruptedException {
        List<ClientStreamingOuterClass.Message> requestPayloads = new ArrayList<>();
        for (String message: messages) {
            requestPayloads.add(
                    ClientStreamingOuterClass.Message.newBuilder()
                            .setMessage(message)
                            .build()
            );
        }

        final CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<ClientStreamingOuterClass.Number> responseObserver = new StreamObserver<ClientStreamingOuterClass.Number>() {
            @Override
            public void onNext(ClientStreamingOuterClass.Number number) {
                System.out.println("[server to client] %d".formatted(number.getValue()));
            }

            @Override
            public void onError(Throwable t) {
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                finishLatch.countDown();
            }
        };

        StreamObserver<ClientStreamingOuterClass.Message> requestObserver = asyncStub.getServerResponse(responseObserver);
        try {
            for (ClientStreamingOuterClass.Message requestPayload: requestPayloads) {
                requestObserver.onNext(requestPayload);

                Thread.sleep(1000);
                System.out.println("[client to server] %s".formatted(requestPayload));

                if (finishLatch.getCount() == 0) {
                    return;
                }
            }
        } catch (RuntimeException e) {
            requestObserver.onError(e);
            throw e;
        }
        requestObserver.onCompleted();

        finishLatch.await(1, TimeUnit.MINUTES);
    }
}