package utils;

import io.restassured.response.Response;
import pojo.LoginRequest;

import static io.restassured.RestAssured.*;

public class TokenManager {

 private static String token;

 public static String getToken() {
  if (token == null) {
   LoginRequest login = new LoginRequest("kminchelle","0lelplR");
   Response response =
    given()
     .contentType("application/json")
     .body(login)
    .post("/auth/login");

   token = response.jsonPath().getString("token");
  }
  return token;
 }
}
