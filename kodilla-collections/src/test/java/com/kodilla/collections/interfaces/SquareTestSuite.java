package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTestSuite {
    @Test
    void testEquals() {
        Square square1 = new Square(4.0);
        Square square2 = new Square(4.0);
        Square square3 = new Square(5.0);

        assertEquals(square1, square1);

        assertEquals(square1, square2);
        assertEquals(square2, square1);

        Square square4 = new Square(4.0);
        assertEquals(square1, square2);
        assertEquals(square2, square4);
        assertEquals(square1, square4);

        assertNotEquals(square1, square3);
        assertNotEquals(square1, null);
        assertNotEquals(square1, new Object());
    }

    @Test
    void testHashCode() {
        Square square1 = new Square(4.0);
        Square square2 = new Square(4.0);
        Square square3 = new Square(5.0);

        assertEquals(square1.hashCode(), square2.hashCode());

        assertNotEquals(square1.hashCode(), square3.hashCode());
    }

    @Test
    void testToString() {
        Square square = new Square(4.0);

        assertEquals("Square{width=4.0}", square.toString());
    }
}