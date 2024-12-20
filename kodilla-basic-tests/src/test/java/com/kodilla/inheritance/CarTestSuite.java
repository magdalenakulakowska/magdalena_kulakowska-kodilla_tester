package com.kodilla.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CarTestSuite {
    Car car = new Car(4, 5);
    Car mockedCar = Mockito.mock(Car.class);
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testTurnOnLights() {
        doNothing().when(mockedCar).turnOnLights();

        mockedCar.turnOnLights();

        verify(mockedCar, times(1)).turnOnLights();
    }

    @Test
    void testTurnOnLightsResponse() {
        car.turnOnLights();

        assertEquals("Lights were turned on", outputStreamCaptor.toString().trim());
    }

    @Test
    void testOpenDoors() {
        doNothing().when(mockedCar).openDoors();

        mockedCar.openDoors();

        verify(mockedCar, times(1)).openDoors();
    }

    @Test
    void testOpenDoorsResponse() {
        car.openDoors();

        assertEquals("Opening 4 doors", outputStreamCaptor.toString().trim());
    }

    @Test
    void testGetWheels() {
        int expected = 4;

        assertEquals(expected, car.getWheels());
    }

    @Test
    void testCarWithNoWheels() {
        Car car = new Car(0, 5);

        assertEquals(0, car.getWheels());
    }

    @Test
    void testGetSeats() {
        int expected = 5;

        assertEquals(expected, car.getSeats());
    }

    @Test
    void testCarWithNoSeats() {
        Car car = new Car(4, 0);

        assertEquals(0, car.getSeats());
    }

    @Test
    void testDisplayNumberOfSeats() {
        doNothing().when(mockedCar).displayNumberOfSeats();

        mockedCar.displayNumberOfSeats();

        verify(mockedCar, times(1)).displayNumberOfSeats();
    }

    @Test
    void testDisplayNumberOfSeatsResponse() {
        car.displayNumberOfSeats();

        assertEquals("Number of seats: 5", outputStreamCaptor.toString().trim());
    }
}