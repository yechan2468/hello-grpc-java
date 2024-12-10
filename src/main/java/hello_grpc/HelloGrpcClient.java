package hello_grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class HelloGrpcClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        HelloGrpcClientCaller helloGrpcClientCaller = new HelloGrpcClientCaller(channel);
        int result = helloGrpcClientCaller.sendUnaryBlocking();

        System.out.println("result = " + result);
    }
}

class HelloGrpcClientCaller {

    private final MyServiceGrpc.MyServiceBlockingStub blockingStub;

    public HelloGrpcClientCaller(ManagedChannel chl) {
        blockingStub = MyServiceGrpc.newBlockingStub(chl);
    }

    public int sendUnaryBlocking() {
        HelloGrpc.MyNumber response = blockingStub.myFunction(HelloGrpc.MyNumber.newBuilder()
                .setValue(4).build());

        return response.getValue();
    }
}
