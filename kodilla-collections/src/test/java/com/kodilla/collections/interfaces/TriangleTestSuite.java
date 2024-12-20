package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTestSuite {
    @Test
    void testEquals() {
        Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
        Triangle triangle2 = new Triangle(3.0, 4.0, 5.0);
        Triangle triangle3 = new Triangle(6.0, 8.0, 10.0);

        assertEquals(triangle1, triangle1);

        assertEquals(triangle1, triangle2);
        assertEquals(triangle2, triangle1);

        Triangle triangle4 = new Triangle(3.0, 4.0, 5.0);
        assertEquals(triangle1, triangle2);
        assertEquals(triangle2, triangle4);
        assertEquals(triangle1, triangle4);

        assertNotEquals(triangle1, triangle3);
        assertNotEquals(triangle1, null);
        assertNotEquals(triangle1, new Object());
    }

    @Test
    void testHashCode() {
        Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
        Triangle triangle2 = new Triangle(3.0, 4.0, 5.0);
        Triangle triangle3 = new Triangle(6.0, 8.0, 10.0);

        assertEquals(triangle1.hashCode(), triangle2.hashCode());

        assertNotEquals(triangle1.hashCode(), triangle3.hashCode());
    }

    @Test
    void testToString() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        assertEquals("Triangle{height=3.0, width=4.0, hypotenuse=5.0}", triangle.toString());
    }
}