package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTestSuite {
    double a = 2.0;
    Square square = new Square(a);

    @Test
    void testGetArea(){
        double expectedArea = a * a;

        assertEquals(expectedArea, square.getArea(), 0.00001);
    }

    @Test
    void testGetPerimeter() {
        double expectedArea = 4 * a;

        assertEquals(expectedArea, square.getPerimeter(), 0.00001);
    }
}