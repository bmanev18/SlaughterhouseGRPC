package restServer.client;

import shared.dto.ProductDto;
import shared.model.Animal;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IGrpcClient {
    Optional<List<Animal>> getAllRegistered();

    Optional<Animal> getByRegNum(int regNum);

    Optional<List<Animal>> getByDate(LocalDate date);

    Optional<List<Animal>> getByProductId(int productId);

    Optional<List<Animal>> getByOrigin(String farm);

    boolean remove(int regNum);

    boolean add(Animal animal);

    Optional<List<ProductDto>> getProductsByAnimalId(int animalId);

    boolean change(Animal animal);
}
