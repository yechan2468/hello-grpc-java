package hello_grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class HelloGrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server grpcServer = ServerBuilder
                .forPort(8080)
                .addService(new HelloGrpcServerImpl())
                .build();

        grpcServer.start();
        grpcServer.awaitTermination();
    }
}

class HelloGrpcServerImpl extends MyServiceGrpc.MyServiceImplBase {

    @Override
    public void myFunction(HelloGrpc.MyNumber request,
                           StreamObserver<HelloGrpc.MyNumber> responseObserver) {
        HelloGrpc.MyNumber response = HelloGrpc.MyNumber.newBuilder()
                .setValue(request.getValue() * request.getValue())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
