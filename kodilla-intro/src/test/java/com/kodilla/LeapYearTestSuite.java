package com.kodilla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTestSuite {

    @Test
    void testLeapYear() {
        assertTrue(LeapYear.isLeapYear(2020), "2020 should be a leap year");
        assertTrue(LeapYear.isLeapYear(2000), "2000 should be a leap year");
        assertTrue(LeapYear.isLeapYear(1600), "1600 should be a leap year");

        assertFalse(LeapYear.isLeapYear(2021), "2021 should not be a leap year");
        assertFalse(LeapYear.isLeapYear(2100), "2100 should not be a leap year");
        assertFalse(LeapYear.isLeapYear(2022), "2022 should not be a leap year");
    }
}