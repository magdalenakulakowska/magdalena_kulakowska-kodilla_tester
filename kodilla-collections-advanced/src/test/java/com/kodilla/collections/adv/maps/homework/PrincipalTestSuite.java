package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTestSuite {
    Principal principal = new Principal("John", "Doe");

    @Test
    void testConstructorAndGetters() {
        assertEquals("John", principal.getFirstName());
        assertEquals("Doe", principal.getLastName());
    }

    @Test
    void testEquals() {
        Principal principal2 = new Principal("John", "Doe");
        Principal principal3 = new Principal("Jane", "Doe");

        assertEquals(principal, principal2);
        assertNotEquals(principal, principal3);
    }

    @Test
    void testHashCode() {
        Principal principal2 = new Principal("John", "Doe");

        assertEquals(principal.hashCode(), principal2.hashCode());
    }

    @Test
    void testToString() {
        String result = principal.toString();

        assertEquals("Principal{firstName='John', lastName='Doe'}", result);
    }
}