package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookControllerTestSuite {

    @Test
    public void shouldFetchBooks() {
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        List<BookDto> result = bookController.getBooks();

        assertThat(result).hasSize(2);
        assertEquals(result, booksList);
        Mockito.verify(bookServiceMock).getBooks();
    }

    @Test
    public void shouldAddBook() {
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        BookDto book = new BookDto("Title 1", "Author 1");
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(book);
        Mockito.doNothing().when(bookServiceMock).addBook(book);
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        bookController.addBook(book);
        List<BookDto> result = bookController.getBooks();

        assertThat(result).hasSize(1);
        assertEquals(result, booksList);
        Mockito.verify(bookServiceMock).addBook(book);
    }

    @Test
    public void shouldRemoveBook() {
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        BookDto book = new BookDto("Title 1", "Author 1");
        BookDto book2 = new BookDto("Title 2", "Author 2");
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(book);
        Mockito.doNothing().when(bookServiceMock).addBook(book);
        Mockito.doNothing().when(bookServiceMock).removeBook(book);
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        bookController.addBook(book);
        bookController.addBook(book2);
        bookController.removeBook(book2);
        List<BookDto> result = bookController.getBooks();

        assertThat(result).hasSize(1);
        assertEquals(result, booksList);
        Mockito.verify(bookServiceMock).removeBook(book2);
    }

}