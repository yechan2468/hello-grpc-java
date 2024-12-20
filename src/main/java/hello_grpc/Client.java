package hello_grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import hello_grpc.HelloGrpc;

public class Client {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        ClientCaller helloGrpcClientCaller = new ClientCaller(channel);
        int result = helloGrpcClientCaller.requestCalculateSquare();

        System.out.println("gRPC result: " + result);
    }
}

class ClientCaller {

    private final MyServiceGrpc.MyServiceBlockingStub blockingStub;

    public ClientCaller(ManagedChannel chl) {
        blockingStub = MyServiceGrpc.newBlockingStub(chl);
    }

    public int requestCalculateSquare() {
        HelloGrpc.MyNumber response = blockingStub.myFunction(HelloGrpc.MyNumber.newBuilder()
                .setValue(4).build());

        return response.getValue();
    }
}
