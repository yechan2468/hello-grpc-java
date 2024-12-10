package bidirectional_streaming;

import client_streaming.ClientStreamingOuterClass;
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
        clientCaller.requestEcho();
    }
}

class ClientCaller {

    private final BidirectionalGrpc.BidirectionalStub asyncStub;

    private final String[] messages = {
            "message #1",
            "message #2",
            "message #3",
            "message #4",
            "message #5"
    };

    public ClientCaller(ManagedChannel chl) {
        asyncStub = BidirectionalGrpc.newStub(chl);
    }

    public void requestEcho() throws InterruptedException {
        List<BidirectionalOuterClass.Message> requestPayloads = new ArrayList<>();
        for (String message: messages) {
            requestPayloads.add(
                    BidirectionalOuterClass.Message.newBuilder()
                            .setMessage(message)
                            .build()
            );
        }

        final CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<BidirectionalOuterClass.Message> responseObserver = new StreamObserver<BidirectionalOuterClass.Message>() {
            @Override
            public void onNext(BidirectionalOuterClass.Message response) {
                System.out.println("[server to client] %s".formatted(response.getMessage()));
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

        StreamObserver<BidirectionalOuterClass.Message> requestObserver = asyncStub.getServerResponse(responseObserver);
        try {
            for (BidirectionalOuterClass.Message requestPayload: requestPayloads) {
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