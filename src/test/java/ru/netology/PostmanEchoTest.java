package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    public void shouldReturnDemoTest() {

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("1, 2")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("1, 2"))
        ;
    }
}
