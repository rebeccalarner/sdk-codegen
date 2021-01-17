package com.google.looker.server;

import com.google.looker.server.rtl.ping.PingServiceImpl;
import com.google.looker.server.sdk.LookerServiceImpl;
import com.google.looker.server.sdk.LookerStreamingServiceImpl;
import io.grpc.ServerBuilder;

import java.io.File;
import java.io.IOException;

public class Server {
  public Server() {
  }

  public void run() throws IOException, InterruptedException {
    System.out.println("Server starting up");
    io.grpc.Server server = ServerBuilder
        .forPort(50051)
        .addService(new PingServiceImpl())
        .addService(new LookerServiceImpl())
        .addService(new LookerStreamingServiceImpl())
        .useTransportSecurity(
            new File("ssl/server.crt"),
            new File("ssl/server.pem")
        )
        // .intercept(new AuthorizationInterceptor())
        .build();
    server.start();
    System.out.println("Server running");
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      System.out.println("Server shutdown request received");
      server.shutdown();
      System.out.println("Server shutdown");
    }));
    server.awaitTermination();
  }

  public static void main(String[] args) throws IOException, InterruptedException {
    new Server().run();
  }
}
