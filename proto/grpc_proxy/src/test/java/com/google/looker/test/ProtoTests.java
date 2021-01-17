package com.google.looker.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.looker.client.LookerGrpcClient;
import com.google.looker.server.rtl.PingRequest;
import com.google.looker.server.rtl.PingServiceGrpc;
import javax.net.ssl.SSLException;
import org.junit.jupiter.api.Test;

public class ProtoTests {

  private LookerGrpcClient lookerGrpcClient = new LookerGrpcClient();

  @Test
  void ping() throws SSLException {
    PingServiceGrpc.PingServiceBlockingStub client = lookerGrpcClient.getBlockingClient();
    boolean active = client.ping((PingRequest.newBuilder().build())).getActive();
    assertEquals(true, active);
  }

}
