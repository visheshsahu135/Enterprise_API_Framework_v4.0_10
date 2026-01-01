package tests;

import base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.UserResponse;
import utils.TokenManager;

import static io.restassured.RestAssured.*;

public class ApiChainingTest extends BaseTest {

 @Test
 public void chainingWithPojo() {
  String token = TokenManager.getToken();

  UserResponse user =
   given()
    .header("Authorization","Bearer "+token)
   .when()
    .get("/users/1")
   .then()
    .statusCode(200)
    .extract().as(UserResponse.class);

  Assert.assertEquals(user.id,1);
 }
}
