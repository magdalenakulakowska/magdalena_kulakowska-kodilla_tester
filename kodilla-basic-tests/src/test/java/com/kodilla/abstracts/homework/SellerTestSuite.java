package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SellerTestSuite {
    @Test
    void testSellerSalary() {
        // Given
        Seller seller = new Seller();

        // When
        int salary = seller.getSalary();

        // Then
        assertEquals(3500, salary);
    }

    @Test
    void testHairDresserResponsibilities() {
        // Given
        Seller seller = new Seller();

        // When
        String[] responsibilities = seller.getResponsibilities();

        // Then
        assertArrayEquals(
                new String[] {"Customer service", "Stocktaking", "Filling supplies"},
                responsibilities
        );
    }

}