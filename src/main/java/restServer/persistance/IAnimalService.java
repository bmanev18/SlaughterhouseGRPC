package restServer.persistance;

import shared.dto.ProductDto;
import shared.model.Animal;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IAnimalService {
    Optional<List<Animal>> getAllRegistered();
    Optional<Animal> getByRegNum(int regNum);
    Optional<List<Animal>> getByDate(LocalDate date);
    Optional<List<Animal>> getByProductId(int productId);
    Optional<List<Animal>> getByOrigin(String farm);
    boolean add(Animal animal);
    boolean change(Animal animal);
    boolean remove(int regNum);

    Optional<List<ProductDto>> getProductsByAnimalId(int animalId);
}
