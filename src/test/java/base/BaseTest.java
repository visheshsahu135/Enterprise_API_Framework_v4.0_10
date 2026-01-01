package base;

import config.ConfigManager;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

 @BeforeSuite
 public void setup() {
  RestAssured.baseURI = ConfigManager.getBaseUrl();
 }
}
