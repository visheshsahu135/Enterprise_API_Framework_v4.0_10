package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class MultipartTest extends BaseTest {

	@Test
	public void multipartUpload() {
		given().multiPart("file", "dummy.txt", "hello".getBytes()).when().post("/posts/add").then().log().all(); // log
																													// everything
	}
}
