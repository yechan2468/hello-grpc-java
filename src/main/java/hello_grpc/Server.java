package hello_grpc;

import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        io.grpc.Server grpcServer = ServerBuilder
                .forPort(8080)
                .addService(new ServerImpl())
                .build();

        grpcServer.start();
        grpcServer.awaitTermination();
    }
}

class ServerImpl extends MyServiceGrpc.MyServiceImplBase {

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
