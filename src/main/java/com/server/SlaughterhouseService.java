package com.server;

import com.protobuf.SlaughterhouseGrpc;
import com.protobuf.SlaughterhouseOuterClass;
import io.grpc.stub.StreamObserver;

public class SlaughterhouseService extends SlaughterhouseGrpc.SlaughterhouseImplBase {

    @Override
    public void getProductsByAnimal(SlaughterhouseOuterClass.ProductListRequest request, StreamObserver<SlaughterhouseOuterClass.ProductListResponse> responseObserver) {
        //super.getProductsByAnimal(request, responseObserver);

        System.out.printf("Received request -> %s", request.toString());
        /*SlaughterhouseOuterClass.ProductListResponse output= SlaughterhouseOuterClass.ProductListResponse.newBuilder()
                .setProducts(request.getAnimalRegistrationNumber(), )*/
    }

    @Override
    public void getAnimalsByTray(SlaughterhouseOuterClass.AnimalListRequest request, StreamObserver<SlaughterhouseOuterClass.AnimalListResponse> responseObserver) {
        super.getAnimalsByTray(request, responseObserver);
    }
}
