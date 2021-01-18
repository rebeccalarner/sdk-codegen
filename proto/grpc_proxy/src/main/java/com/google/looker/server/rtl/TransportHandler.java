package com.google.looker.server.rtl;

public class TransportHandler {

  final private Transport defaultTransport;
  final private Transport loginTransport;
  final private Transport logoutTransport;

  public TransportHandler() {
    defaultTransport = new DefaultTransport();
    loginTransport = new LoginTransport();
    logoutTransport = new LogoutTransport();
  }

  public Transport getTransport(String path) {
    if (path.startsWith("/login")) {
      return loginTransport;
    } else if (path.startsWith("/logout")) {
        return logoutTransport;
    } else {
      return defaultTransport;
    }
  }

}
