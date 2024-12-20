package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTestSuite {
    double a = 2.0;
    double b = 3.0;
    Rectangle rectangle = new Rectangle(a, b);

    @Test
    void testGetArea(){
        double expectedArea = a * b;

        assertEquals(expectedArea, rectangle.getArea(), 0.00001);
    }

    @Test
    void testGetPerimeter() {
        double expectedArea = 2 * a + 2* b;

        assertEquals(expectedArea, rectangle.getPerimeter(), 0.00001);
    }
}