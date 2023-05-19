package grpcServer.database;

import protobuf.SlaughterhouseOuterClass;

import java.sql.SQLException;

public interface DAO {
 void createAnimalPart(int id, String type, double weight) throws SQLException;
 void createTray(double weight, String type) throws SQLException;

 void createTrayContains(int tray_id, int part_id) throws SQLException;

 void createProduct(String type) throws SQLException;

 void createProductContains(int product_id, int tray_id) throws SQLException;

 SlaughterhouseOuterClass.boolResponse createAnimal(String date, double weight, String origin) throws SQLException;

SlaughterhouseOuterClass.AllAnimalsMessage getAllByProduct(int prod_id) throws SQLException;

SlaughterhouseOuterClass.ProductListResponse getAllProducts(int animal_id) throws SQLException;

 SlaughterhouseOuterClass.AllAnimalsMessage getAllAnimals() throws SQLException;

 SlaughterhouseOuterClass.Animal getByRegNum(int regNum) throws SQLException;

 SlaughterhouseOuterClass.AllAnimalsMessage getAllByDate(String date) throws SQLException;

 SlaughterhouseOuterClass.AllAnimalsMessage getAllByOrigin(String farm) throws SQLException;

 SlaughterhouseOuterClass.boolResponse changeAnimal(int registrationNumber, String registrationDate, double weight, String origin) throws SQLException;

 SlaughterhouseOuterClass.boolResponse removeAnimal(int regNum) throws SQLException;
}
