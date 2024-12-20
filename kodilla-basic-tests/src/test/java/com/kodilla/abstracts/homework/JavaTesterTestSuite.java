package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaTesterTestSuite {
    JavaTester javaTester = new JavaTester();

    @Test
    void testJavaTesterSalary() {
        // When
        int salary = javaTester.getSalary();

        // Then
        assertEquals(8000, salary);
    }

    @Test
    void testJavaTesterResponsibilities() {
        // When
        String[] responsibilities = javaTester.getResponsibilities();

        // Then
        assertArrayEquals(
                new String[] {"Grey box testing", "Writing test cases", "Writing unit tests"},
                responsibilities
        );
    }
}