package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LinuxTestSuite {
    OperatingSystem linux;
    OperatingSystem mockedLinux = Mockito.mock(Linux.class);
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        linux = new Linux(2005);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testTurnOn() {
        doNothing().when(mockedLinux).turnOn();

        mockedLinux.turnOn();

        verify(mockedLinux, times(1)).turnOn();
    }

    @Test
    void testTurnOnResponse() {
        linux.turnOn();

        assertEquals("System Linux was turned on", outputStreamCaptor.toString().trim());
    }

    @Test
    void testTurnOff() {
        doNothing().when(mockedLinux).turnOff();

        mockedLinux.turnOff();

        verify(mockedLinux, times(1)).turnOff();
    }

    @Test
    void testTurnOffResponse() {
        linux.turnOff();

        assertEquals("System Linux was turned off", outputStreamCaptor.toString().trim());
    }

    @Test
    void testGetYear() {
        int year = linux.getYear();

        assertEquals(2005, year);
    }

    @Test
    void testDisplayYear() {
        doNothing().when(mockedLinux).displayYear();

        mockedLinux.displayYear();

        verify(mockedLinux, times(1)).displayYear ();
    }

    @Test
    void testDisplayYearResponse() {
        linux.displayYear();

        assertEquals("Release year:2005", outputStreamCaptor.toString().trim());
    }
}