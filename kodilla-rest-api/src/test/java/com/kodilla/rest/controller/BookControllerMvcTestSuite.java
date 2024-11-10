package com.kodilla.rest.controller;

import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(BookController.class)
public class BookControllerMvcTestSuite {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    public void shouldFetchBooks() throws Exception {
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);

        mockMvc.perform(MockMvcRequestBuilders.get("/books")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }

    @Test
    public void shouldAddBook() throws Exception {
        BookDto book = new BookDto("Title 1", "Author 1");
        Mockito.doNothing().when(bookService).addBook(book);
        Gson gson = new Gson();
        String jsonString = gson.toJson(book);

        mockMvc.perform(MockMvcRequestBuilders.post("/books")
                .content(jsonString)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(200));
    }

    @Test
    public void shouldRemoveBook() throws Exception {
        BookDto book = new BookDto("Title 1", "Author 1");
        Mockito.doNothing().when(bookService).removeBook(book);
        Gson gson = new Gson();
        String jsonString = gson.toJson(book);

        mockMvc.perform(MockMvcRequestBuilders.delete("/books")
                .content(jsonString)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(200));

    }
}
