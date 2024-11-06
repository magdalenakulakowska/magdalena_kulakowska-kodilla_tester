package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @MockBean
    Display display;

    @Autowired
    Calculator calculator;

    @Test
    public void shouldAddAndDisplay() {
        Double result = calculator.add(15.0, 13.0);

        assertEquals(28.0, result);
        Mockito.verify(display).display(28.0);
    }

    @Test
    public void shoudSubtractAndDisplay() {
        Double result = calculator.subtract(15.0, 17.0);

        assertEquals(-2.0, result);
        Mockito.verify(display).display(-2.0);
    }

    @Test
    public void shouldMultiplyAndDisplay() {
        Double result = calculator.multiply(2.0, 5.0);

        assertEquals(10.0, result);
        Mockito.verify(display).display(10.0);
    }

    @Test
    public void shouldDivideAndDisplay() {
        Double result = calculator.divide(10.0, -5.0);

        assertEquals(-2.0, result);
        Mockito.verify(display).display(-2.0);
    }

    @Test
    public void shouldNotDivideByZeroAndShouldNotDisplayMessageFromDisplayComponent() {
        Double result = calculator.divide(10.0, 0.0);

        assertEquals(0.0, result);
        Mockito.verify(display, Mockito.never()).display(0.0);
    }
}