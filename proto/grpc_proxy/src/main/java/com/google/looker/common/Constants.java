package com.google.looker.common;

import static io.grpc.Metadata.ASCII_STRING_MARSHALLER;

import io.grpc.Context;
import io.grpc.Metadata;

public class Constants {
  public static final String SERVER_HOST = "SERVER_HOST";
  public static final String SERVER_LISTEN_PORT = "SERVER_LISTEN_PORT";
  public static final String CERT_CHAIN_FILE = "CERT_CHAIN_FILE";
  public static final String PRIVATE_KEY_FILE = "PRIVATE_KEY_FILE";
  public static final String TRUST_MANAGER_FILE = "TRUST_MANAGER_FILE";
  public static final String JWT_SIGNING_KEY = "JWT_SIGNING_KEY";
  public static final String BEARER_TYPE = "Bearer";
  public static final Metadata.Key<String> AUTHORIZATION_METADATA_KEY = Metadata.Key.of("Authorization", ASCII_STRING_MARSHALLER);
  public static final Context.Key<String> CLIENT_ID_CONTEXT_KEY = Context.key("clientId");
}
