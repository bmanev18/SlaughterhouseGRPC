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

        System.out.println("Received request for all products from animal -> "+request.getAnimalRegistrationNumber());
        SlaughterhouseOuterClass.ProductListResponse output;
        try {
            output = dao.getAllProducts(request.getAnimalRegistrationNumber());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        responseObserver.onNext(output);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllRegistered(SlaughterhouseOuterClass.emptyMessage request, StreamObserver<SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
        System.out.println("Received request for all registered animals");

        SlaughterhouseOuterClass.AllAnimalsMessage animals;
        try {
            animals = dao.getAllAnimals();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        responseObserver.onNext(animals);
        responseObserver.onCompleted();
    }

    @Override
    public void getByRegNum(SlaughterhouseOuterClass.RegNum request, StreamObserver<SlaughterhouseOuterClass.Animal> responseObserver) {
        System.out.println("Received request for animals -> " + request.getRegNum());

        SlaughterhouseOuterClass.Animal animals;
        try {
            animals = dao.getByRegNum(request.getRegNum());
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        responseObserver.onNext(animals);
        responseObserver.onCompleted();
    }

    @Override
    public void getByDate(SlaughterhouseOuterClass.Date request, StreamObserver<SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
        System.out.println("Received request for all animals registered on -> " + request.getDate());

        SlaughterhouseOuterClass.AllAnimalsMessage animals;
        try {
            animals = dao.getAllByDate(request.getDate());
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        responseObserver.onNext(animals);
        responseObserver.onCompleted();
    }

    @Override
    public void getByProductId(SlaughterhouseOuterClass.ProductId request, StreamObserver<SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
        System.out.println("Received request for all animals in product -> " + request.getProductId());

        SlaughterhouseOuterClass.AllAnimalsMessage output;
        try {
            output = dao.getAllByProduct(request.getProductId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        responseObserver.onNext(output);
        responseObserver.onCompleted();
    }

    @Override
    public void getByOrigin(SlaughterhouseOuterClass.Farm request, StreamObserver<SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
        System.out.println("Received request for all animals with origin -> " + request.getFarm());

        SlaughterhouseOuterClass.AllAnimalsMessage animals;
        try {
            animals = dao.getAllByOrigin(request.getFarm());
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        responseObserver.onNext(animals);
        responseObserver.onCompleted();
    }

    @Override
    public void add(SlaughterhouseOuterClass.Animal request, StreamObserver<SlaughterhouseOuterClass.boolResponse> responseObserver) {
        System.out.println("Received request to add animal");

        SlaughterhouseOuterClass.boolResponse response;
        try {
            response = dao.createAnimal(request.getRegistrationDate(), request.getWeight(), request.getOrigin());
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void change(SlaughterhouseOuterClass.Animal request, StreamObserver<SlaughterhouseOuterClass.boolResponse> responseObserver) {
        System.out.println("Received request to update animal -> " + request.getRegistrationNumber());

        SlaughterhouseOuterClass.boolResponse response;
        try {
            response = dao.changeAnimal(request.getRegistrationNumber(), request.getRegistrationDate(), request.getWeight(), request.getOrigin());
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void remove(SlaughterhouseOuterClass.RegNum request, StreamObserver<SlaughterhouseOuterClass.boolResponse> responseObserver) {
        System.out.println("Received request to remove animal -> " + request.getRegNum());

        SlaughterhouseOuterClass.boolResponse response;
        try {
            response = dao.removeAnimal(request.getRegNum());
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
