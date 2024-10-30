package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @MockBean
    Display display;

    @Autowired
    Calculator calculator;

    @Test
    public void shouldAdd() {
        Double result = calculator.add(15.0, 13.0);

        assertEquals(28.0, result);
    }

    @Test
    public void shouldDisplayCorrectMessageForAdd() {
        calculator.add(15.0,13.0);

        Mockito.verify(display, Mockito.times(1)).display(28.0);
    }

    @Test
    public void shoudSubtract() {
        Double result = calculator.subtract(15.0, 17.0);

        assertEquals(-2.0, result);
    }

    @Test
    public void shouldDisplayCorrectMessageForSubtract() {
        calculator.subtract(15.0,17.0);

        Mockito.verify(display, Mockito.times(1)).display(-2.0);
    }

    @Test
    public void shouldMultiply() {
        Double result = calculator.multiply(2.0, 5.0);

        assertEquals(10.0, result);
    }

    @Test
    public void shouldDisplayCorrectMessageForMultiply() {
        calculator.multiply(2.0,5.0);

        Mockito.verify(display, Mockito.times(1)).display(10.0);
    }

    @Test
    public void shouldDivide() {
        Double result = calculator.divide(10.0, -5.0);

        assertEquals(-2.0, result);
    }

    @Test
    public void shouldDisplayCorrectMessageForDivide() {
        calculator.divide(10.0,-5.0);

        Mockito.verify(display, Mockito.times(1)).display(-2.0);
    }

    @Test
    public void shouldNotDivideByZero() {
        Double result = calculator.divide(10.0, 0.0);

        assertEquals(0.0, result);
    }

    @Test
    public void shouldNotDisplayMessageFromDisplayComponent() {
        calculator.divide(10.0, 0.0);

        Mockito.verify(display, Mockito.never()).display(0.0);
    }
}