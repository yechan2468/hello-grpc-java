package client_streaming;

import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        io.grpc.Server grpcServer = ServerBuilder
                .forPort(50051)
                .addService(new ServerImpl())
                .executor(threadPool)
                .build();

        System.out.println("Starting server. Listening on port 50051.");
        grpcServer.start();
        grpcServer.awaitTermination();
    }
}

class ServerImpl extends ClientStreamingGrpc.ClientStreamingImplBase {
    @Override
    public StreamObserver<ClientStreamingOuterClass.Message> getServerResponse(
            StreamObserver<ClientStreamingOuterClass.Number> responseObserver
    ) {
        System.out.println("Server processing gRPC client-streaming.");

        return new StreamObserver<ClientStreamingOuterClass.Message>() {
            private int count = 0;

            @Override
            public void onNext(ClientStreamingOuterClass.Message message) {
                count++;
            }

            @Override
            public void onError(Throwable throwable) { /* do nothing */ }

            @Override
            public void onCompleted() {
                responseObserver.onNext(ClientStreamingOuterClass.Number.newBuilder()
                        .setValue(count)
                        .build());

                responseObserver.onCompleted();
            }
        };
    }
}