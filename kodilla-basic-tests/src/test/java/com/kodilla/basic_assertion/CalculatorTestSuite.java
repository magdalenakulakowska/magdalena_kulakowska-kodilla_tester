package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquaringForNegativeNumber() {
        Calculator calculator = new Calculator();
        int a = -5;
        double squaringResult = calculator.squaring(a);
        assertEquals(25, squaringResult, 0.01);
    }

    @Test
    public void testSquaringForZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        double squaringResult = calculator.squaring(a);
        assertEquals(0, squaringResult, 0.01);
    }

    @Test
    public void testSquaringForPositiveNumber() {
        Calculator calculator = new Calculator();
        int a = 5;
        double squaringResult = calculator.squaring(a);
        assertEquals(25, squaringResult, 0.01);
    }
}
