package com.kodilla.rest.controller;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ExternalApiRestAssuredTestSuite {

    @Test
    public void testGetPostShouldReturnStatus200AndValidResponse() {
        given().
            header("Content type", "application/json").
        when().
            get("https://jsonplaceholder.typicode.com/posts/1").
        then().assertThat().
            statusCode(HttpStatus.SC_OK).
            body("userId", equalTo(1)).
            body("id", equalTo(1)).
            body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")).
            body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")).
            log().all();
    }

    @Test
    public void testUpdatePostShouldReturnStatus200AndValidResponse() {
        given().
            header("Content type", "application/json").
        when().
            body("{ \"userId\": 1, \"id\": 1, \"title\": \"First post\", \"body\": \"Hi! It's My first post\" }").
            put("https://jsonplaceholder.typicode.com/posts/1").
        then().assertThat().
            statusCode(HttpStatus.SC_OK);
    }
}
