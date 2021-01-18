package com.google.looker.server.rtl;

public class LookerClient {
  final private TransportHandler transportHandler;

  public LookerClient() {
    transportHandler = new TransportHandler();
  }

  public LookerClientResponse get(String path, String inputJson) {
    return transportHandler.getTransport(path).request(Transport.HttpMethod.GET, path, inputJson);
  }

  public LookerClientResponse post(String path, String inputJson) {
    return transportHandler.getTransport(path).request(Transport.HttpMethod.GET, path, inputJson);
  }

  public LookerClientResponse put(String path, String inputJson) {
    return transportHandler.getTransport(path).request(Transport.HttpMethod.GET, path, inputJson);
  }

  public LookerClientResponse patch(String path, String inputJson) {
    return transportHandler.getTransport(path).request(Transport.HttpMethod.GET, path, inputJson);
  }

  public LookerClientResponse delete(String path, String inputJson) {
    return transportHandler.getTransport(path).request(Transport.HttpMethod.DELETE, path, inputJson);
  }

}
