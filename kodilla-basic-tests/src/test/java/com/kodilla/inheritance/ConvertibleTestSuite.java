package com.kodilla.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ConvertibleTestSuite {
    Convertible convertible = new Convertible(4, 2);
    Convertible mockedConvertible = Mockito.mock(Convertible.class);
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testOpenRoof() {
        doNothing().when(mockedConvertible).openRoof();

        mockedConvertible.openRoof();

        verify(mockedConvertible, times(1)).openRoof();
    }

    @Test
    void testTurnOnLightsResponse() {
        convertible.openRoof();

        assertEquals("Opening roof...", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCloseRoof() {
        doNothing().when(mockedConvertible).closeRoof();

        mockedConvertible.closeRoof();

        verify(mockedConvertible, times(1)).closeRoof();
    }

    @Test
    void testCloseRoofResponse() {
        convertible.closeRoof();

        assertEquals("Closing roof...", outputStreamCaptor.toString().trim());
    }

    @Test
    void testOpenDoors() {
        doNothing().when(mockedConvertible).openDoors();

        mockedConvertible.openDoors();

        verify(mockedConvertible, times(1)).openDoors();
    }

    @Test
    void testOpenDoorsResponse() {
        convertible.openDoors();

        assertEquals("Opening 2 doors", outputStreamCaptor.toString().trim());
    }
}