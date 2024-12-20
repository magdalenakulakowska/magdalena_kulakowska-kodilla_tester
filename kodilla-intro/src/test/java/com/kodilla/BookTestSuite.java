package com.kodilla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTestSuite {

    @Test
    void testBookCreationWithConstructor() {
        String author = "Isaac Asimov";
        String title = "The Galaxy";

        Book book = new Book(author, title);

        assertEquals("Isaac Asimov", book.getAuthor());
        assertEquals("The Galaxy", book.getTitle());
    }

    @Test
    void testBookCreationWithStaticMethod() {
        String author = "Isaac Asimov";
        String title = "The Galaxy";

        Book book = Book.of(author, title);

        assertEquals("Isaac Asimov", book.getAuthor());
        assertEquals("The Galaxy", book.getTitle());
    }
}