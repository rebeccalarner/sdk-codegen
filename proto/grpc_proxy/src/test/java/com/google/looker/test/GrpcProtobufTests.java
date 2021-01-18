package com.google.looker.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.looker.client.LookerGrpcClient;
import com.google.looker.common.Constants;
import com.google.looker.grpc.services.LoginRequest;
import com.google.looker.grpc.services.LoginResponse;
import com.google.looker.grpc.services.LookerServiceGrpc;
import com.google.looker.grpc.services.PingServiceGrpc;
import com.google.looker.server.rtl.PingRequest;
import javax.net.ssl.SSLException;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrpcProtobufTests {

  private static final Logger LOGGER = LoggerFactory.getLogger(GrpcProtobufTests.class);

  private LookerGrpcClient lookerGrpcClient = new LookerGrpcClient();

  @Test
  void ping() throws SSLException {
    LOGGER.debug("run ping test");
    PingServiceGrpc.PingServiceBlockingStub stub = lookerGrpcClient.getPingBlockingStub();
    boolean active = stub.ping((PingRequest.newBuilder().build())).getActive();
    assertEquals(true, active);
  }

  @Test
  void login() throws SSLException {
    LOGGER.debug("run login test");
    LookerServiceGrpc.LookerServiceBlockingStub stub = lookerGrpcClient.getLookerServiceBlockingStub();
    LoginResponse loginResponse = stub.login(
        LoginRequest
            .newBuilder()
            .setClientId(System.getProperty(Constants.LOOKER_CLIENT_ID))
            .setClientSecret(System.getProperty(Constants.LOOKER_CLIENT_SECRET))
            .build()
    );
    assertEquals(200, loginResponse.getStatusCode());
  }

}
