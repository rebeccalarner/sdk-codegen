package com.google.looker.client;

import com.google.looker.common.Constants;
import com.google.looker.grpc.services.LookerServiceGrpc;
import com.google.looker.grpc.services.PingServiceGrpc;
import io.github.cdimascio.dotenv.Dotenv;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import java.io.File;
import javax.net.ssl.SSLException;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LookerGrpcClient {
  private static final Logger LOGGER = LoggerFactory.getLogger(LookerGrpcClient.class);

  private SSLException initFailure;
  private ManagedChannel channel;
  private PingServiceGrpc.PingServiceBlockingStub pingBlockingStub;
  private LookerServiceGrpc.LookerServiceBlockingStub lookerServiceBlockingStub;

  public LookerGrpcClient() {
    try {
      channel = NettyChannelBuilder
          .forAddress(
              System.getProperty(Constants.GRPC_SERVER_HOST),
              NumberUtils.toInt(System.getProperty(Constants.GRPC_SERVER_LISTEN_PORT))
          )
          .sslContext(
              GrpcSslContexts
                  .forClient()
                  .trustManager(new File(System.getProperty(Constants.TRUST_MANAGER_FILE))
                  ).build())
          .build();
    } catch (SSLException e) {
      LOGGER.error("initialization failure");
      initFailure = e;
    }
  }

  public PingServiceGrpc.PingServiceBlockingStub getPingBlockingStub() throws SSLException {
    if (initFailure != null) {
      throw  initFailure;
    }
    if (pingBlockingStub == null) {
      pingBlockingStub = PingServiceGrpc.newBlockingStub(channel);
    }
    return pingBlockingStub;
  }

  public LookerServiceGrpc.LookerServiceBlockingStub getLookerServiceBlockingStub() throws SSLException {
    if (initFailure != null) {
      throw  initFailure;
    }
    if (lookerServiceBlockingStub == null) {
      lookerServiceBlockingStub = LookerServiceGrpc.newBlockingStub(channel);
    }
    return lookerServiceBlockingStub;
  }

  static {
    Dotenv dotenv = Dotenv.load();
    dotenv.entries().forEach(e -> System.setProperty(e.getKey(), e.getValue()));
  }
}
