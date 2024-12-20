package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTestSuite {
    double r = 2.0;
    Circle circle = new Circle(2.0);

    @Test
    void testGetArea(){
        double expectedArea = Math.PI * r * r;

        assertEquals(expectedArea, circle.getArea(), 0.00001);
    }

    @Test
    void testGetPerimeter() {
        double expectedArea = 2 * Math.PI * r;

        assertEquals(expectedArea, circle.getPerimeter(), 0.00001);
    }
}