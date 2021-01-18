package com.google.looker.server.rtl;

public interface Transport {
  enum HttpMethod {
    GET,
    POST,
    PUT,
    PATCH,
    DELETE
  }
  LookerClientResponse request(
      HttpMethod method,
      String path,
      String inputJson);
}
