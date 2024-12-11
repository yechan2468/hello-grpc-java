package hello_grpc;

import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import hello_grpc.HelloGrpc;  // gRPC messages
import hello_grpc.Hello_Grpc;  // myFunc

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

class ServerImpl extends MyServiceGrpc.MyServiceImplBase {

    @Override
    public void myFunction(HelloGrpc.MyNumber request,
                           StreamObserver<HelloGrpc.MyNumber> responseObserver) {
        HelloGrpc.MyNumber response = HelloGrpc.MyNumber.newBuilder()
                .setValue(Hello_Grpc.myFunc(request.getValue()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
