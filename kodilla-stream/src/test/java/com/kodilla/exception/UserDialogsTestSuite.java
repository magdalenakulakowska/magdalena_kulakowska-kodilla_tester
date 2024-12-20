package com.kodilla.exception;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class UserDialogsTestSuite {

    @Test
    void testGetNumberOfRounds_validInput() {
        String input = "5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int result = UserDialogs.getNumberOfRounds();

        assertEquals(5, result);
    }

    @Test
    void testGetNumberOfRounds_invalidInput() {
        String input = "invalid\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int result = UserDialogs.getNumberOfRounds();

        assertEquals(5, result);
    }
}