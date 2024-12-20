package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HairDresserTestSuite {
    @Test
    void testHairDresserSalary() {
        // Given
        HairDresser hairDresser = new HairDresser();

        // When
        int salary = hairDresser.getSalary();

        // Then
        assertEquals(5800, salary);
    }

    @Test
    void testHairDresserResponsibilities() {
        // Given
        HairDresser hairDresser = new HairDresser();

        // When
        String[] responsibilities = hairDresser.getResponsibilities();

        // Then
        assertArrayEquals(
                new String[] {"Washing hair", "Cutting hair", "Drying hair"},
                responsibilities
        );
    }
}