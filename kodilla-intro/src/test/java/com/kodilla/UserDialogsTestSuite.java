package com.kodilla;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class UserDialogsTestSuite {

    @Test
    void testGetUsername() {
        String mockInput = "John\n";
        InputStream inputStream = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        String username = UserDialogs.getUsername();

        assertEquals("John", username);
        assertEquals("Enter your name:", outputStream.toString().trim());

        System.setIn(System.in);
        System.setOut(System.out);
    }

    @Test
    void testGetUserSelection() {
        String mockInput = "A\n";
        InputStream inputStream = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        String selection = UserDialogs.getUserSelection();

        assertEquals("ADD", selection);
        assertEquals("Select calculation (A-add, S-subtract, D-divide, M-multiply):", outputStream.toString().trim());

        System.setIn(System.in);
        System.setOut(System.out);
    }

    @Test
    void testGetValue() {
        String mockInput = "42\n";
        InputStream inputStream = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        int value = UserDialogs.getValue();

        assertEquals(42, value);
        assertEquals("Enter number:", outputStream.toString().trim());

        System.setIn(System.in);
        System.setOut(System.out);
    }

    @Test
    void testGetUserColorSelection() {
        String mockInput = "R\n";
        InputStream inputStream = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        String color = UserDialogs.getUserColorSelection();

        assertEquals("R", color);
        assertEquals("Select color (R-red, G-green, B-blue, W-white, P-purple):", outputStream.toString().trim());

        System.setIn(System.in);
        System.setOut(System.out);
    }
}