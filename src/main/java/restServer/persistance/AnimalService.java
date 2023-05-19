package restServer.persistance;

import shared.dto.ProductDto;
import shared.model.Animal;
import org.springframework.stereotype.Service;
import restServer.client.GrpcClient;
import restServer.client.IGrpcClient;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalService implements IAnimalService {
private final IGrpcClient client;

    public AnimalService(GrpcClient client) {
        this.client = client;
    }

    @Override
    public Optional<List<Animal>> getAllRegistered() {
        return client.getAllRegistered();
    }

    @Override
    public Optional<Animal> getByRegNum(int regNum) {
        return client.getByRegNum(regNum);
    }

    @Override
    public Optional<List<Animal>> getByDate(LocalDate date) {
        return client.getByDate(date);
    }


    @Override
    public Optional<List<Animal>> getByProductId(int productId) {
        return client.getByProductId(productId);
    }

    @Override
    public Optional<List<Animal>> getByOrigin(String farm) {
        return client.getByOrigin(farm);
    }

    @Override
    public boolean add(Animal animal) {
        Optional<Animal> exists = getByRegNum(animal.getRegNum());
        boolean successful = false;
        if (exists.isEmpty()) {
            client.add(animal);
            successful = true;
        }
        return successful;
    }

    @Override
    public boolean change(Animal animal) {
        return client.change(animal);
    }

    @Override
    public boolean remove(int regNum) {
        Optional<Animal> existing = getByRegNum(regNum);
        boolean result = false;
        if (existing.isPresent()) {
            result = client.remove(existing.get().getRegNum());
        }
        return result;
    }

    @Override
    public Optional<List<ProductDto>> getProductsByAnimalId(int animalId) {
       return client.getProductsByAnimalId(animalId);
    }
}
