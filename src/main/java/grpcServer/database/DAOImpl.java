package grpcServer.database;

import protobuf.SlaughterhouseOuterClass;

import java.sql.*;
import java.time.LocalDate;

public class DAOImpl implements DAO {

    public DAOImpl() throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres?currentSchema=slaughterhouse",
                "postgres", "2121");
    }


    @Override
    public void createAnimal(LocalDate date, double weight, String origin) throws SQLException {
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO animal(regdate, weight, origin) VALUES (?,?,?);");
            statement.setDate(1, Date.valueOf(date));
            statement.setDouble(2, weight);
            statement.setString(3, origin);

            statement.executeUpdate();
            statement.close();
        }
    }

    @Override
    public void createAnimalPart(int id, String type, double weight) throws SQLException {
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO animal_part(animal_id, type, weight) VALUES (?,?,?);");
            statement.setInt(1, id);
            statement.setString(2, type);
            statement.setDouble(3, weight);
            statement.executeUpdate();
            statement.close();
        }
    }

    @Override
    public void createTray(double weight, String type) throws SQLException {
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO tray(weight, parts_type) VALUES (?,?);");
            statement.setDouble(1, weight);
            statement.setString(2, type);
            statement.executeUpdate();
            statement.close();
        }
    }

    @Override
    public void createTrayContains(int tray_id, int part_id) throws SQLException {
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO tray_contains(tray_id, part_id) VALUES (?,?);");
            statement.setInt(1, tray_id);
            statement.setInt(2, part_id);
            statement.executeUpdate();
            statement.close();
        }
    }

    @Override
    public void createProduct(String type) throws SQLException {
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO product(product_type) VALUES (?);");
            statement.setString(1, type);
            statement.executeUpdate();
            statement.close();
        }
    }

    @Override
    public void createProductContains(int product_id, int tray_id) throws SQLException {
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO product_contains(product_id, tray_id) VALUES (?,?);");
            statement.setInt(1, product_id);
            statement.setInt(2, tray_id);
            statement.executeUpdate();
            statement.close();
        }
    }

    @Override
    public SlaughterhouseOuterClass.AnimalListResponse getAllRegNumber(int prod_id) throws SQLException {
        SlaughterhouseOuterClass.AnimalListResponse response;
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT animal_id " +
                    "FROM animal_part ap, tray t, tray_contains tc, " +
                    "product p, product_contains pc " +
                    "WHERE p.id = ? " +
                    "AND pc.product_id = p.id " +
                    "AND tc.tray_id = t.id " +
                    "AND tc.part_id = ap.id " +
                    "AND pc.tray_id = t.id");
            statement.setInt(1, prod_id);
            ResultSet resultSet = statement.executeQuery();
            connection.close();

            SlaughterhouseOuterClass.AnimalListResponse.Builder builder = SlaughterhouseOuterClass.AnimalListResponse.newBuilder();
            while (resultSet.next()) {
                builder.addRegNum(resultSet.getInt("animal_id"));
            }
            response = builder.setCode(200).build();
            statement.close();
        }
        return response;
    }

    @Override
    public SlaughterhouseOuterClass.ProductListResponse getAllProducts(int animal_id) throws SQLException {
        SlaughterhouseOuterClass.ProductListResponse response;
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * " +
                    "FROM animal_part ap, tray t, tray_contains tc, " +
                    "product p, product_contains pc " +
                    "WHERE tc.part_id = ? " +
                    "AND tc.tray_id = t.id " +
                    "AND pc.tray_id = t.id " +
                    "AND pc.product_id = p.id");
            statement.setInt(1, animal_id);

            ResultSet resultSet = statement.executeQuery();
            connection.close();

            SlaughterhouseOuterClass.ProductListResponse.Builder builder = SlaughterhouseOuterClass.ProductListResponse.newBuilder();
            while (resultSet.next()) {
                int id = resultSet.getInt("product_id");
                builder.addProducts(SlaughterhouseOuterClass.ProductDto.newBuilder()
                        .setId(id)
                        .build());
            }

            response = builder.setCode(200).build();
            statement.close();
        }
        return response;
    }
}


