package utils;

import static io.restassured.RestAssured.*;

public class OAuthTokenManager {

    private static String accessToken;
    private static String refreshToken;

    public static String getAccessToken() {
        if (accessToken == null) {
            generateToken();
        }
        return accessToken;
    }

    private static void generateToken() {
        accessToken =
            given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("grant_type", "password")
                .formParam("client_id", "client-id")
                .formParam("client_secret", "client-secret")
                .formParam("username", "user")
                .formParam("password", "pass")
            .post("/oauth/token")
            .jsonPath().getString("access_token");
    }
}
