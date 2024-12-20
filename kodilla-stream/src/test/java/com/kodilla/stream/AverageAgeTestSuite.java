package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageAgeTestSuite {

    @Test
    void testGetAverageAge() {

        AverageAge averageAge = new AverageAge();

        double expectedAverage = (50 + 25 + 34 + 49 + 44 + 57) / 6.0;

        assertEquals(expectedAverage, averageAge.getAverageAge());
    }
}