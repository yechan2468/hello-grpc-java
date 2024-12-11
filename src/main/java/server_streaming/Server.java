package server_streaming;

import io.grpc.ServerBuilder;
import server_streaming.ServerStreamingOuterClass;
import server_streaming.ServerStreamingGrpc;
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

class ServerImpl extends ServerStreamingGrpc.ServerStreamingImplBase {

    @Override
    public void getServerResponse(ServerStreamingOuterClass.Number request,
                                  StreamObserver<ServerStreamingOuterClass.Message> responseObserver
    ) {
        System.out.println("Server processing gRPC server-streaming %d.".formatted(request.getValue()));

        try {
            final String[] messages = {
                    "message #1",
                    "message #2",
                    "message #3",
                    "message #4",
                    "message #5"
            };

            for (String message: messages) {
                ServerStreamingOuterClass.Message response = makeMessage(message);
                responseObserver.onNext(response);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) { /* do nothing */ }

        responseObserver.onCompleted();
    }

    private ServerStreamingOuterClass.Message makeMessage(String message) {
        return ServerStreamingOuterClass.Message.newBuilder()
                .setMessage(message)
                .build();
    }
}