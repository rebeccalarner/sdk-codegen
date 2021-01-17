package com.google.looker.server.rtl.auth;

import com.google.looker.common.Constants;
import io.grpc.Context;
import io.grpc.Contexts;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.Status;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthorizationInterceptor implements ServerInterceptor {

  private static final Logger LOGGER = LoggerFactory.getLogger(AuthorizationInterceptor.class);

  private final JwtParser parser;
  private final Set<String> unsecuredMethods
      = new HashSet<>(Arrays.asList("Login", "LoginUser", "Ping"));

  public AuthorizationInterceptor() {
    parser = Jwts.parser().setSigningKey(System.getProperty((Constants.JWT_SIGNING_KEY)));
  }

  @Override
  public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
    String value = metadata.get(Constants.AUTHORIZATION_METADATA_KEY);
    LOGGER.info(String.format("Method called is %s", serverCall.getMethodDescriptor().getBareMethodName()));
    Status status;
    if (value == null) {
      if (unsecuredMethods.contains(serverCall.getMethodDescriptor().getBareMethodName())) {
        Context ctx = Context.current();
        return Contexts.interceptCall(ctx, serverCall, metadata, serverCallHandler);
      } else {
        status = Status.UNAUTHENTICATED.withDescription("Authorization token is missing");
      }
    } else if (!value.startsWith(Constants.BEARER_TYPE)) {
      status = Status.UNAUTHENTICATED.withDescription("Unknown authorization type");
    } else {
      try {
        String token = value.substring(Constants.BEARER_TYPE.length()).trim();
        Jws<Claims> claims = parser.parseClaimsJws(token);
        Context ctx = Context.current().withValue(Constants.CLIENT_ID_CONTEXT_KEY, claims.getBody().getSubject());
        return Contexts.interceptCall(ctx, serverCall, metadata, serverCallHandler);
      } catch (Exception e) {
        status = Status.UNAUTHENTICATED.withDescription(e.getMessage()).withCause(e);
      }
    }

    serverCall.close(status, metadata);
    return new ServerCall.Listener<ReqT>() {
      // noop
    };
  }
}
