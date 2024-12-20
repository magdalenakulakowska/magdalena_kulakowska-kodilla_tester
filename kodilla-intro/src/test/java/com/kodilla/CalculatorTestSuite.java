package com.kodilla;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class CalculatorTestSuite {
    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        double result = calculator.add(5, 3);

        assertEquals(8, result, 0.001);
    }

    @Test
    void testSub() {
        double result = calculator.sub(5, 3);

        assertEquals(2, result, 0.001);
    }

    @Test
    void testCirclePerimeter() {
        double radius = 5;

        double perimeter = calculator.circlePerimeter(radius);

        assertEquals(31.4159, perimeter, 0.0001);
    }

    @Test
    void testStaticCounter() {
        Calculator.counter = 0;
        new Calculator();
        new Calculator();

        assertEquals(2, Calculator.counter);
    }
}