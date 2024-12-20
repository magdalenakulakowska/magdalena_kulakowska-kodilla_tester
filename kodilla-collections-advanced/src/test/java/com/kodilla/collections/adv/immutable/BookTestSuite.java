package com.kodilla.collections.adv.immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTestSuite {

    @Test
    void testConstructorAndGetters() {
        String author = "J.K. Rowling";
        String title = "Harry Potter and the Sorcerer's Stone";

        Book book = new Book(author, title);

        assertEquals(author, book.getAuthor());
        assertEquals(title, book.getTitle());
    }
}