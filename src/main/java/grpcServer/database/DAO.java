package grpcServer.database;

import protobuf.SlaughterhouseOuterClass;

import java.sql.SQLException;
import java.time.LocalDate;

public interface DAO {
 void createAnimal(LocalDate date, double weight, String origin) throws SQLException;
 void createAnimalPart(int id, String type, double weight) throws SQLException;

 void createTray(double weight, String type) throws SQLException;

 void createTrayContains(int tray_id, int part_id) throws SQLException;

 void createProduct(String type) throws SQLException;

 void createProductContains(int product_id, int tray_id) throws SQLException;

SlaughterhouseOuterClass.AnimalListResponse getAllRegNumber(int prod_id) throws SQLException;

SlaughterhouseOuterClass.ProductListResponse getAllProducts(int animal_id) throws SQLException;
}
