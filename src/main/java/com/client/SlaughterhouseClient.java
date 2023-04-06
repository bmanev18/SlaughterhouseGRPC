package com.client;

import com.protobuf.SlaughterhouseGrpc;
import com.protobuf.SlaughterhouseOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SlaughterhouseClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        SlaughterhouseGrpc.SlaughterhouseBlockingStub stub = SlaughterhouseGrpc.newBlockingStub(managedChannel);
        SlaughterhouseOuterClass.ProductListRequest productRequest = SlaughterhouseOuterClass.ProductListRequest
                .newBuilder()
                .setAnimalRegistrationNumber(1)
                .build();

        SlaughterhouseOuterClass.AnimalListRequest animalRequest = SlaughterhouseOuterClass.AnimalListRequest
                .newBuilder()
                .setProductId(1)
                .build();


        SlaughterhouseOuterClass.ProductListResponse productResponse = stub.getProductsByAnimal(productRequest);
        System.out.println("Received -> " + productResponse.getProductsList());

        SlaughterhouseOuterClass.AnimalListResponse animalResponse = stub.getAnimalsByProduct(animalRequest);
        System.out.println("Received -> " + animalResponse.getRegNumList());
    }
}
