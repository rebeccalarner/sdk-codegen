package com.google.looker.server.rtl;

import io.grpc.Status;

public class LookerClientResponse {

  private Status status;
  private String jsonResponse;

  public LookerClientResponse(Status status) {
    this.status = status;
  }

  public LookerClientResponse(String jsonResponse) {
    this.jsonResponse = jsonResponse;
  }

  public Status getStatus() {
    return status;
  }

  public String getJsonResponse() {
    return jsonResponse;
  }
}
