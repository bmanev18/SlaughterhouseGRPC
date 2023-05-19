package restServer.client;


import io.grpc.ManagedChannelBuilder;
import protobuf.SlaughterhouseGrpc;
import protobuf.SlaughterhouseOuterClass;
import shared.dto.ProductDto;
import shared.model.Animal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GrpcClient implements IGrpcClient {

    private final SlaughterhouseGrpc.SlaughterhouseBlockingStub stub = SlaughterhouseGrpc.newBlockingStub(ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build());

    @Override
    public Optional<List<Animal>> getAllRegistered() {
        SlaughterhouseOuterClass.AllAnimalsMessage registered = stub.getAllRegistered(SlaughterhouseOuterClass.emptyMessage.newBuilder().build());
        return Optional.of(toAnimals(registered).get());
    }

    @Override
    public Optional<Animal> getByRegNum(int regNum) {
        SlaughterhouseOuterClass.RegNum request = SlaughterhouseOuterClass.RegNum.newBuilder().setRegNum(regNum).build();
        var call = stub.getByRegNum(request);

        Animal animal = new Animal(toDate(call.getRegistrationDate()), call.getWeight(), call.getRegistrationNumber(), call.getOrigin());
        return Optional.of(animal);
    }

    @Override
    public Optional<List<Animal>> getByDate(LocalDate date) {
        SlaughterhouseOuterClass.AllAnimalsMessage animals = stub.getByDate(SlaughterhouseOuterClass.Date.newBuilder().setDate(date.toString()).build());
        return toAnimals(animals);
    }

    @Override
    public Optional<List<Animal>> getByProductId(int productId) {
        SlaughterhouseOuterClass.ProductId request = SlaughterhouseOuterClass.ProductId.newBuilder().setProductId(productId).build();
        var call = stub.getByProductId(request);
        return toAnimals(call);
    }

    @Override
    public Optional<List<Animal>> getByOrigin(String farm) {
        SlaughterhouseOuterClass.Farm request = SlaughterhouseOuterClass.Farm.newBuilder().setFarm(farm).build();
        var call = stub.getByOrigin(request);
        return toAnimals(call);
    }

    @Override
    public boolean remove(int regNum) {
        SlaughterhouseOuterClass.RegNum request = SlaughterhouseOuterClass.RegNum.newBuilder().setRegNum(regNum).build();
        return stub.remove(request).getBoolBABY();


    }

    @Override
    public boolean add(Animal animal) {
        SlaughterhouseOuterClass.Animal request = SlaughterhouseOuterClass.Animal
                .newBuilder()
                .setOrigin(animal.getOrigin())
                .setWeight(animal.getWeight())
                .setRegistrationNumber(animal.getRegNum())
                .setRegistrationDate(animal.getDate().toString())
                .build();
        return stub.add(request).getBoolBABY();

    }

    @Override
    public Optional<List<ProductDto>> getProductsByAnimalId(int animalId) {
        SlaughterhouseOuterClass.ProductListRequest request = SlaughterhouseOuterClass.ProductListRequest
                .newBuilder()
                .setAnimalRegistrationNumber(animalId)
                .build();
        var call = stub.getProductsByAnimal(request);
        List<ProductDto> products = new ArrayList<>();
        for (SlaughterhouseOuterClass.ProductDto product : call.getProductsList() ) {
            products.add(new ProductDto(product.getId()));
        }
        return Optional.of(products);
    }

    @Override
    public boolean change(Animal animal) {
        SlaughterhouseOuterClass.Animal request = SlaughterhouseOuterClass.Animal.newBuilder()
                .setRegistrationDate(animal.getDate().toString())
                .setWeight(animal.getWeight())
                .setOrigin(animal.getOrigin())
                .setRegistrationNumber(animal.getRegNum())
        .build();
        return stub.change(request).getBoolBABY();
    }


    private LocalDate toDate(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yy"));
    }

    private Optional<List<Animal>> toAnimals(SlaughterhouseOuterClass.AllAnimalsMessage message){
        return Optional.of(message.getAnimalsList().stream()
                .map(animal -> new Animal(toDate(animal.getRegistrationDate()),
                        animal.getWeight(),
                        animal.getRegistrationNumber(),
                        animal.getOrigin()))
                .collect(Collectors.toList()));
    }


    /* public static void main(String[] args) {

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
    }*/
}
