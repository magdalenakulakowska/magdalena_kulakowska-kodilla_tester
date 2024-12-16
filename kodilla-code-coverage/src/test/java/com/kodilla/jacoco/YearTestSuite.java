package com.kodilla.jacoco;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class YearTestSuite {

    @ParameterizedTest
    @CsvSource({"2024", "1600", "2000"})
    public void shouldBeLeapYear(int givenYear) {
        //given
        LeapYear year = new LeapYear(givenYear);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @ParameterizedTest
    @CsvSource({"2025", "2030", "1991", "1873", "1900"})
    public void shouldNotBeLeapYear(int givenYear) {
        //given
        LeapYear year = new LeapYear(givenYear);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }
}