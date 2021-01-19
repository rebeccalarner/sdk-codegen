package com.google.looker.server.rtl;

import com.google.looker.common.Constants;
import io.grpc.Status;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

final public class DefaultTransport implements Transport {

  final private static Logger LOGGER = LoggerFactory.getLogger(DefaultTransport.class);

  private OkHttpClient client;

  public static final MediaType JSON
      = MediaType.parse("application/json; charset=utf-8");

  public LookerClientResponse request(
      String apiVersion,
      HttpMethod method,
      String path,
      String inputJson) {
    LOGGER.debug("request " + method + "/" + path);
    return new LookerClientResponse(Status.UNAVAILABLE);
  }

  final public OkHttpClient getHttpClient()
      throws NoSuchAlgorithmException, KeyManagementException {
    if (this.client == null) {
      OkHttpClient.Builder builder = new OkHttpClient.Builder();
      if (System.getProperty(Constants.LOOKER_VERIFY_SSL).equals("false")) {
        final TrustManager[] trustAllCerts = new TrustManager[]{
            new X509TrustManager() {

              @Override
              public void checkClientTrusted(java.security.cert.X509Certificate[] chain,
                  String authType) throws
                  CertificateException {
              }

              @Override
              public void checkServerTrusted(java.security.cert.X509Certificate[] chain,
                  String authType) throws
                  CertificateException {
              }

              @Override
              public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return new java.security.cert.X509Certificate[]{};
              }
            }
        };
        final SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
        final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
        builder.sslSocketFactory(sslSocketFactory, (X509TrustManager) trustAllCerts[0])
            .hostnameVerifier(new HostnameVerifier() {
              @Override
              public boolean verify(String hostname, SSLSession session) {
                return true;
              }
            });
        ;
      }
      this.client = builder.build();
    }
    return this.client;
  }

}
