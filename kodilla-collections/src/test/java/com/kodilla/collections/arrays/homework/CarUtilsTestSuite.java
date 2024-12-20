package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CarUtilsTestSuite {
    @Test
    void testDescribeCarFord() {
        Car ford = Mockito.mock(Ford.class);
        Mockito.when(ford.getSpeed()).thenReturn(120);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CarUtils.describeCar(ford);

        String output = outputStream.toString();
        assertTrue(output.contains("Car kind: Ford"));
        assertTrue(output.contains("Car speed: 120"));
    }

    @Test
    void testDescribeCarKia() {
        Car kia = Mockito.mock(Kia.class);
        Mockito.when(kia.getSpeed()).thenReturn(90);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CarUtils.describeCar(kia);

        String output = outputStream.toString();
        assertTrue(output.contains("Car kind: Kia"));
        assertTrue(output.contains("Car speed: 90"));
    }

    @Test
    void testDescribeCarOpel() {
        Car opel = Mockito.mock(Opel.class);
        Mockito.when(opel.getSpeed()).thenReturn(80);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CarUtils.describeCar(opel);

        String output = outputStream.toString();
        assertTrue(output.contains("Car kind: Opel"));
        assertTrue(output.contains("Car speed: 80"));
    }

    @Test
    void testDescribeCarUnknown() {
        Car unknownCar = Mockito.mock(Car.class);
        Mockito.when(unknownCar.getSpeed()).thenReturn(60);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CarUtils.describeCar(unknownCar);

        String output = outputStream.toString();
        assertTrue(output.contains("Car kind: Unknown car name"));
        assertTrue(output.contains("Car speed: 60"));
    }

    @Test
    void testDescribeCarWithNegativeSpeed() {
        Car opel = Mockito.mock(Opel.class);
        Mockito.when(opel.getSpeed()).thenReturn(-10);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CarUtils.describeCar(opel);

        String output = outputStream.toString();
        assertTrue(output.contains("Car kind: Opel"));
        assertTrue(output.contains("Car speed: -10"));
    }

}