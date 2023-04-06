package com.server;

import com.database.DAO;
import com.database.DAOImpl;
import com.protobuf.SlaughterhouseGrpc;
import com.protobuf.SlaughterhouseOuterClass;
import io.grpc.stub.StreamObserver;

import java.sql.SQLException;

public class SlaughterhouseService extends SlaughterhouseGrpc.SlaughterhouseImplBase {
    DAO dao = new DAOImpl();

    public SlaughterhouseService() throws SQLException {
    }

    @Override
    public void getProductsByAnimal(SlaughterhouseOuterClass.ProductListRequest request, StreamObserver<SlaughterhouseOuterClass.ProductListResponse> responseObserver) {
        //super.getProductsByAnimal(request, responseObserver);
        /*SlaughterhouseOuterClass.ProductListResponse output= SlaughterhouseOuterClass.ProductListResponse.newBuilder()
                .setProducts(request.getAnimalRegistrationNumber(), )*/

        System.out.println("Received request -> "+ request.toString());
        SlaughterhouseOuterClass.ProductListResponse output = null;
        try {
            output = dao.getAllProducts(request.getAnimalRegistrationNumber());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        responseObserver.onNext(output);
        responseObserver.onCompleted();
    }

    @Override
    public void getAnimalsByProduct(SlaughterhouseOuterClass.AnimalListRequest request, StreamObserver<SlaughterhouseOuterClass.AnimalListResponse> responseObserver) {
        System.out.println("Received message -> " + request.toString());

        SlaughterhouseOuterClass.AnimalListResponse output = null;
        try {
            output = dao.getAllRegNumber(request.getProductId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        responseObserver.onNext(output);
        responseObserver.onCompleted();
    }
}
