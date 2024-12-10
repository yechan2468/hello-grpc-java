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

    private String[] questionMessages = {
            "message #1",
            "message #2",
            "message #3",
            "message #4",
            "message #5"
    };

    @Override
    public void getServerResponse(ServerStreamingOuterClass.Number request,
                                  StreamObserver<ServerStreamingOuterClass.Message> responseObserver
    ) {
        System.out.println("Server processing gRPC server-streaming %d.".formatted(request.getValue()));
        for (String questionMessage: questionMessages) {
            ServerStreamingOuterClass.Message response = ServerStreamingOuterClass.Message.newBuilder()
                    .setMessage(questionMessage)
                    .build();

            responseObserver.onNext(response);
        }

        responseObserver.onCompleted();
    }
}