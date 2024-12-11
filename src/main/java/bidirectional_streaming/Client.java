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

    public ClientCaller(ManagedChannel chl) {
        asyncStub = BidirectionalGrpc.newStub(chl);
    }

    public void requestEcho() throws InterruptedException {
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
        List<BidirectionalOuterClass.Message> requestPayloads = generateMessages();
        try {
            boolean sendMessageResult = sendMessage(requestPayloads, requestObserver, finishLatch);
            if (!sendMessageResult) return;
        } catch (RuntimeException e) {
            requestObserver.onError(e);
            throw e;
        }
        requestObserver.onCompleted();

        finishLatch.await(1, TimeUnit.MINUTES);
    }

    private static boolean sendMessage(List<BidirectionalOuterClass.Message> requestPayloads, StreamObserver<BidirectionalOuterClass.Message> requestObserver, CountDownLatch finishLatch) throws InterruptedException {
        for (BidirectionalOuterClass.Message requestPayload: requestPayloads) {
            requestObserver.onNext(requestPayload);

            Thread.sleep(1000);
            System.out.println("[client to server] %s".formatted(requestPayload));

            if (finishLatch.getCount() == 0) {
                return false;
            }
        }
        return true;
    }

    private List<BidirectionalOuterClass.Message> generateMessages() {
        final String[] messages = {
                "message #1",
                "message #2",
                "message #3",
                "message #4",
                "message #5"
        };

        List<BidirectionalOuterClass.Message> requestPayloads = new ArrayList<>();
        for (String message: messages) {
            requestPayloads.add(
                    makeMessage(message)
            );
        }
        return requestPayloads;
    }

    private BidirectionalOuterClass.Message makeMessage(String message) {
        return BidirectionalOuterClass.Message.newBuilder()
                .setMessage(message)
                .build();
    }
}