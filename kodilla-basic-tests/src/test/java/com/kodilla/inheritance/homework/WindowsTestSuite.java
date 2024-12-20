package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class WindowsTestSuite {
    private OperatingSystem windows;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        windows = new Windows(2005);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testTurnOn() {
        windows.turnOn();

        assertEquals("System Windows was turned on", outputStreamCaptor.toString().trim());
    }

    @Test
    void testTurnOff() {
        windows.turnOff();

        assertEquals("System Windows was turned off", outputStreamCaptor.toString().trim());
    }

    @Test
    void testGetYear() {
        int year = windows.getYear();

        assertEquals(2005, year);
    }

    @Test
    void testDisplayYear() {
        windows.displayYear();

        assertEquals("Release year:2005", outputStreamCaptor.toString().trim());
    }
}