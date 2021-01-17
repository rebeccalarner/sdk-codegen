package com.google.looker.server.rtl;

import io.grpc.Status;

public class LookerClient {

  public LookerClientResponse get(String path, String inputJson) {
    return new LookerClientResponse(Status.UNAVAILABLE);
  }

  public LookerClientResponse post(String path, String inputJson) {
    return new LookerClientResponse(Status.UNAVAILABLE);
  }

  public LookerClientResponse put(String path, String inputJson) {
    return new LookerClientResponse(Status.UNAVAILABLE);
  }

  public LookerClientResponse patch(String path, String inputJson) {
    return new LookerClientResponse(Status.UNAVAILABLE);
  }

  public LookerClientResponse delete(String path, String inputJson) {
    return new LookerClientResponse(Status.UNAVAILABLE);
  }

}
