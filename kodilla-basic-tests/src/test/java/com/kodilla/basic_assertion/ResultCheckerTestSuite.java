package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultCheckerTestSuite {

    @Test
    void testFalseAssertEquals() {
        boolean expected = false;

        assertEquals(expected, ResultChecker.assertEquals(4, 15));
    }

    @Test
    void testTrueAssertEquals() {
        boolean expected = true;

        assertEquals(expected, ResultChecker.assertEquals(4, 4));
    }

    @Test
    void testFalseAssertEqualsDouble() {
        boolean expected = false;

        assertEquals(expected, ResultChecker.assertEqualsDouble(4.4, 15.2));
    }

    @Test
    void testTrueAssertEqualsDouble() {
        boolean expected = true;

        assertEquals(expected, ResultChecker.assertEqualsDouble(4.2, 4.2));
    }
}