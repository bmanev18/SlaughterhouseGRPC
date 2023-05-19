package grpcServer.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.sql.SQLException;

public class StartServer {
    public static void main(String[] args) throws IOException, InterruptedException, SQLException {
        Server server= ServerBuilder.forPort(9090).addService(new SlaughterhouseService()).build();
        server.start();
        System.out.println("Server started");
        server.awaitTermination();
    }
}
