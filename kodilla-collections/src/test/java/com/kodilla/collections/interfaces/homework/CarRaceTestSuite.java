package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CarRaceTestSuite {

    @Test
    void testDoRaceWithMockedCar() {
        Car mockedCar = Mockito.mock(Car.class);
        when(mockedCar.getSpeed()).thenReturn(60, 40);

        CarRace.doRace(mockedCar);

        verify(mockedCar, times(3)).increaseSpeed();
        verify(mockedCar, times(2)).decreaseSpeed();
        verify(mockedCar, times(1)).getSpeed();
    }

    @Test
    void testDoRaceWithFord() {
        Car ford = new Ford();

        CarRace.doRace(ford);

        assertEquals(40, ford.getSpeed());
    }

    @Test
    void testDoRaceWithOpel() {
        Car opel = new Opel();

        CarRace.doRace(opel);

        assertEquals(50, opel.getSpeed());
    }

    @Test
    void testDoRaceWithKia() {
        Car kia = new Kia();

        CarRace.doRace(kia);

        assertEquals(32, kia.getSpeed());
    }
}