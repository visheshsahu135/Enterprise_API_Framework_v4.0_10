package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class SchemaValidationTest extends BaseTest {

 @Test
 public void schemaTest() {
  given()
  .when()
   .get("/users/1")
  .then()
   .body(matchesJsonSchemaInClasspath("schemas/user-schema.json"));
 }
}
