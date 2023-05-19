package grpcServer.server;

import grpcServer.database.DAO;
import grpcServer.database.DAOImpl;
import io.grpc.stub.StreamObserver;
import protobuf.SlaughterhouseGrpc;
import protobuf.SlaughterhouseOuterClass;

import java.sql.SQLException;

public class SlaughterhouseService extends SlaughterhouseGrpc.SlaughterhouseImplBase {
    DAO dao = new DAOImpl();

    public SlaughterhouseService() throws SQLException {
    }

    /*rpc GetProductsByAnimal(ProductListRequest) returns (ProductListResponse);
  rpc GetAnimalsByProduct(AnimalListRequest) returns (AnimalListResponse);
  rpc GetAllRegistered(emptyMessage) returns (AllAnimalsMessage); //TODO
  rpc GetByRegNum(RegNum) returns (Animal); //TODO
  rpc GetByProductId(ProductId) returns (AllAnimalsMessage); //TODO
  rpc GetByOrigin(Farm) returns (AllAnimalsMessage); //TODO
  rpc Add(Animal) returns (boolResponse); //TODO
  rpc Change(Animal) returns (boolResponse); //TODO
  rpc Remove(RegNum) returns (boolResponse); //TODO*/

    @Override
    public void getProductsByAnimal(SlaughterhouseOuterClass.ProductListRequest request, StreamObserver<SlaughterhouseOuterClass.ProductListResponse> responseObserver) {

        System.out.println("Received request -> " + request.toString());
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

    @Override
    public void getAllRegistered(SlaughterhouseOuterClass.emptyMessage request, StreamObserver<SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
        super.getAllRegistered(request, responseObserver);
    }

    @Override
    public void getByRegNum(SlaughterhouseOuterClass.RegNum request, StreamObserver<SlaughterhouseOuterClass.Animal> responseObserver) {
        super.getByRegNum(request, responseObserver);
    }

    @Override
    public void getByProductId(SlaughterhouseOuterClass.ProductId request, StreamObserver<SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
        super.getByProductId(request, responseObserver);
    }

    @Override
    public void getByOrigin(SlaughterhouseOuterClass.Farm request, StreamObserver<SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
        super.getByOrigin(request, responseObserver);
    }

    @Override
    public void add(SlaughterhouseOuterClass.Animal request, StreamObserver<SlaughterhouseOuterClass.boolResponse> responseObserver) {
        super.add(request, responseObserver);
    }

    @Override
    public void change(SlaughterhouseOuterClass.Animal request, StreamObserver<SlaughterhouseOuterClass.boolResponse> responseObserver) {
        super.change(request, responseObserver);
    }

    @Override
    public void remove(SlaughterhouseOuterClass.RegNum request, StreamObserver<SlaughterhouseOuterClass.boolResponse> responseObserver) {
        super.remove(request, responseObserver);
    }
}
