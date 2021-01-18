package com.google.looker.server.rtl;

import io.grpc.Status;

public class LogoutTransport implements Transport {

  public LookerClientResponse request(
      HttpMethod method,
      String path,
      String inputJson) {
    return new LookerClientResponse(Status.UNAVAILABLE);
  }

}
