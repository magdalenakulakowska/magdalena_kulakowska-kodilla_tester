package com.kodilla.rest.controller;

import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import java.util.List;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.when;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

@ExtendWith(MockitoExtension.class)
public class BookControllerRestAssuredTestSuite {
    @Mock
    private BookService bookService;
    @InjectMocks  // [1]
    private BookController bookController;

    @BeforeEach
    public void initialiseRestAssuredMockMvcStandalone() {
        RestAssuredMockMvc.standaloneSetup(bookController);  // [2]
    }

    @Test
    public void shouldFetchBooks() {
        Mockito.when(bookService.getBooks())
            .thenReturn(List.of(
                    new BookDto("Title 1", "Author 1"),
                    new BookDto("Title 2", "Author 2")
            ));

        when()
                .get("/books")
        .then()
                .body("$.size()", Matchers.equalTo(2))
                .body("[0].title", Matchers.equalTo("Title 1"))
                .body("[0].author", Matchers.equalTo("Author 1"))
                .body("[1].title", Matchers.equalTo("Title 2"))
                .body("[1].author", Matchers.equalTo("Author 2"))
                .status(HttpStatus.OK);
    }

    @Test
    public void shouldAddBook() {
        BookDto book = new BookDto("Title 1", "Author 1");
        Mockito.doNothing().when(bookService).addBook(book);
        Gson gson = new Gson();
        String jsonString = gson.toJson(book);

        given()
                .header("Content-Type", "application/json")
                .body(jsonString)
        .when()
                .post("/books")
        .then()
                .status(HttpStatus.OK);
    }

    @Test
    public void shouldRemoveBook() {
        BookDto book = new BookDto("Title 1", "Author 1");
        Mockito.doNothing().when(bookService).removeBook(book);
        Gson gson = new Gson();
        String jsonString = gson.toJson(book);

        given()
                .header("Content-Type", "application/json")
                .body(jsonString)
        .when()
                .delete("/books")
        .then()
                .status(HttpStatus.OK);
    }
}