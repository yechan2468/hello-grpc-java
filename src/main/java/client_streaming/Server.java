package client_streaming;

import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {
        io.grpc.Server grpcServer = ServerBuilder
                .forPort(50051)
                .addService(new ServerImpl())
                .build();

        grpcServer.start();
        grpcServer.awaitTermination();
    }
}

class ServerImpl extends ClientStreamingGrpc.ClientStreamingImplBase {
    @Override
    public StreamObserver<ClientStreamingOuterClass.Message> getServerResponse(
            StreamObserver<ClientStreamingOuterClass.Number> responseObserver
    ) {
        return new StreamObserver<ClientStreamingOuterClass.Message>() {
            int count =  0;

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