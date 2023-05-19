package shared.model;

import java.util.List;

public class Product {
private int id;
private List<Tray> trays;

public Product(int id, List<Tray> trays){
    this.id = id;
    this.trays = trays;
}
}
