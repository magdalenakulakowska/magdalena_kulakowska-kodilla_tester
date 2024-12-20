package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class CircleTestSuite {

    @Test
    void testEquals() {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(7.0);

        assertEquals(circle1, circle2);
        assertNotEquals(circle1, circle3);
        assertNotEquals(circle1, null);
        assertNotEquals(circle1, new Object());
    }

    @Test
    void testHashCode() {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);

        assertEquals(circle1.hashCode(), circle2.hashCode());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(5.0);
        assertEquals("Circle{radius=5.0}", circle.toString());
    }
}