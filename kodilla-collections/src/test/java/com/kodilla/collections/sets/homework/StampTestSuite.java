package com.kodilla.collections.sets.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StampTestSuite {
    Stamp stamp = new Stamp("Postage Stamp", 5.0, 3.0, true);

    @Test
    void testGetName() {
        assertEquals("Postage Stamp", stamp.getName());
    }

    @Test
    void testGetWidth() {
        assertEquals(5.0, stamp.getWidth());
    }

    @Test
    void testGetHeight() {
        assertEquals(3.0, stamp.getHeight());
    }

    @Test
    void testIsStamped() {
        assertTrue(stamp.isStamped());
    }

    @Test
    void testEquals() {
        Stamp stamp2 = new Stamp("Postage Stamp", 5.0, 3.0, true);
        Stamp stamp3 = new Stamp("Postage Stamp", 6.0, 3.0, true);

        assertEquals(stamp, stamp);

        assertEquals(stamp, stamp2);
        assertEquals(stamp2, stamp);

        Stamp stamp4 = new Stamp("Postage Stamp", 5.0, 3.0, true);
        assertEquals(stamp, stamp2);
        assertEquals(stamp2, stamp4);
        assertEquals(stamp, stamp4);

        assertNotEquals(stamp, stamp3);
        assertNotEquals(stamp, null);
        assertNotEquals(stamp, new Object());
    }

    @Test
    void testHashCode() {
        Stamp stamp2 = new Stamp("Postage Stamp", 5.0, 3.0, true);
        Stamp stamp3 = new Stamp("Postage Stamp", 6.0, 3.0, true);

        assertEquals(stamp.hashCode(), stamp2.hashCode());

        assertNotEquals(stamp.hashCode(), stamp3.hashCode());
    }

    @Test
    void testToString() {
        assertEquals("Stamp{name='Postage Stamp', width=5.0, height=3.0, isStamped=true}", stamp.toString());
    }
}