package com.google.looker.client;

import com.google.looker.server.rtl.PingRequest;
import com.google.looker.server.rtl.PingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import java.io.File;
import javax.net.ssl.SSLException;

public class PingClient {
  private ManagedChannel channel;
  PingServiceGrpc.PingServiceBlockingStub client;

  PingClient() throws SSLException {
    channel = NettyChannelBuilder.forAddress("localhost", 50051)
        .sslContext(
            GrpcSslContexts
                .forClient()
                .trustManager(new File("ssl/ca.crt")
                ).build())
        .build();
    client = PingServiceGrpc.newBlockingStub(channel);
  }

  PingClient ping() {
    if (client.ping((PingRequest.newBuilder().build())).getActive()) {
      System.out.println("Server is active");
    } else {
      System.out.println("Server is not active");
    }
    return this;
  }

  public static void main(String[] args) throws SSLException {
    new PingClient().ping();
  }
}
