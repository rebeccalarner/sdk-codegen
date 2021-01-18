package com.google.looker.server.rtl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.looker.server.Server;
import io.grpc.Status;
import java.lang.reflect.Type;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginTransport implements Transport {

  private static final Logger LOGGER = LoggerFactory.getLogger(Server.class);

  public LookerClientResponse request(
      HttpMethod method,
      String path,
      String inputJson) {
    LOGGER.debug(inputJson);
    Gson gson = new Gson();
    Type inputDataMapType = new TypeToken<Map<String, Object>>() {}.getType();
    Map<String, Object> inputData = gson.fromJson(inputJson, inputDataMapType);
    LOGGER.debug(inputData.toString());
    return new LookerClientResponse(Status.UNAVAILABLE);
  }

}
