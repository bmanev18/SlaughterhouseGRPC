package restServer.controller;

import shared.dto.ProductDto;
import shared.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restServer.persistance.AnimalService;
import restServer.persistance.IAnimalService;
import shared.model.Product;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animals/")
public class AnimalController {

    private final IAnimalService service;

    @Autowired
    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Animal>> getAll() {
        return new ResponseEntity<>(service.getAllRegistered().get(), HttpStatus.OK);
    }

    @GetMapping("regNum/")
    public ResponseEntity<Animal> getById(int regNum) {
        Optional<Animal> existing = service.getByRegNum(regNum);
        ResponseEntity<Animal> response = existing.map(animal -> new ResponseEntity<>(animal, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.BAD_REQUEST));
        return response;
    }

    @GetMapping("regDate/")
    public ResponseEntity<List<Animal>> getByDate(String date) {
        //2023-03-31
        Optional<List<Animal>> existing = service.getByDate(LocalDate.parse(date));
        ResponseEntity<List<Animal>> response = existing.map(animal -> new ResponseEntity<>(animal, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.BAD_REQUEST));
        return response;
    }

    @GetMapping("origin/")
    public ResponseEntity<List<Animal>> getByOrigin(String origin) {
        Optional<List<Animal>> existing = service.getByOrigin(origin);
        ResponseEntity<List<Animal>> response = existing.map(animal -> new ResponseEntity<>(animal, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.BAD_REQUEST));
        return response;
    }


    @PostMapping
    public ResponseEntity<Animal> add(@RequestBody Animal animal) {
        // condition ? expressionIfTrue : expressionIfFalse
        boolean success = service.add(animal);
        ResponseEntity<Animal> response = success ? new ResponseEntity<>(animal, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return response;
    }

    @PutMapping
    public ResponseEntity<Animal> change(int regNum, @RequestBody Animal animal) {
        if (regNum != animal.getRegNum()) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

        boolean success = service.change(animal);
        ResponseEntity<Animal> response = success
                ? new ResponseEntity<>(animal, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return response;
    }

    @DeleteMapping
    public ResponseEntity delete(int regNum) {
        ResponseEntity result = new ResponseEntity(HttpStatus.BAD_REQUEST);
        if (service.remove(regNum)) {
            result = new ResponseEntity(HttpStatus.OK);
        }
        return result;
    }

    // New Methods
    @GetMapping("product/")
    public ResponseEntity<List<Animal>> getAnimalsByProduct(int productId) {
        Optional<List<Animal>> existing = service.getByProductId(productId);
        return existing.map(animal -> new ResponseEntity<>(animal, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.BAD_REQUEST));

    }

    @GetMapping("animal/")
    public ResponseEntity<List<ProductDto>> getProductsByAnimalId(int animalId){
        Optional<List<ProductDto>> existing = service.getProductsByAnimalId(animalId);
        return existing.map(products -> new ResponseEntity<>(products, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.BAD_REQUEST));

    }


}
