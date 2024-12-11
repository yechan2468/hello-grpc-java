package bidirectional_streaming;

import io.grpc.Grpc;
import io.grpc.ServerBuilder;
import bidirectional_streaming.BidirectionalOuterClass;
import bidirectional_streaming.BidirectionalGrpc;
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

class ServerImpl extends BidirectionalGrpc.BidirectionalImplBase {

    @Override
    public StreamObserver<BidirectionalOuterClass.Message> getServerResponse(
            StreamObserver<BidirectionalOuterClass.Message> responseObserver
    ) {
        System.out.println("Server processing gRPC bidirectional streaming.");

        return new StreamObserver<BidirectionalOuterClass.Message>() {
            @Override
            public void onNext(BidirectionalOuterClass.Message request) {
                BidirectionalOuterClass.Message response = BidirectionalOuterClass.Message.newBuilder()
                        .setMessage(request.getMessage())
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) { /* do nothing */ }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
