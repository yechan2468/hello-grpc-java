package server_streaming;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        ClientCaller clientCaller = new ClientCaller(channel);
        clientCaller.requestMessages();
    }
}

class ClientCaller {

    private final ServerStreamingGrpc.ServerStreamingBlockingStub blockingStub;

    public ClientCaller(ManagedChannel chl) {
        blockingStub = ServerStreamingGrpc.newBlockingStub(chl);
    }

    public void requestMessages() {
        Iterator<ServerStreamingOuterClass.Message> responseIterator
                = blockingStub.getServerResponse(ServerStreamingOuterClass.Number.newBuilder()
                        .setValue(5)
                        .build());

        responseIterator.forEachRemaining(response -> {
            System.out.println("[server to client] %s".formatted(response));
        });
    }
}