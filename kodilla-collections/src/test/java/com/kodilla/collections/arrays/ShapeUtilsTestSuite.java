package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilsTestSuite {

    @Test
    void testDisplayShapeInfoCircle() {
        Shape circle = Mockito.mock(Circle.class);
        Mockito.when(circle.getArea()).thenReturn(28.27);
        Mockito.when(circle.getPerimeter()).thenReturn(18.85);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ShapeUtils.displayShapeInfo(circle);

        String output = outputStream.toString();
        assertTrue(output.contains("Shape kind: Circle"));
        assertTrue(output.contains("Shape area: 28.27"));
        assertTrue(output.contains("Shape perimeter: 18.85"));
    }

    @Test
    void testDisplayShapeInfoTriangle() {
        Shape triangle = Mockito.mock(Triangle.class);
        Mockito.when(triangle.getArea()).thenReturn(10.5);
        Mockito.when(triangle.getPerimeter()).thenReturn(15.0);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ShapeUtils.displayShapeInfo(triangle);

        String output = outputStream.toString();
        assertTrue(output.contains("Shape kind: Triangle"));
        assertTrue(output.contains("Shape area: 10.5"));
        assertTrue(output.contains("Shape perimeter: 15.0"));
    }

    @Test
    void testDisplayShapeInfoSquare() {
        Shape square = Mockito.mock(Square.class);
        Mockito.when(square.getArea()).thenReturn(16.0);
        Mockito.when(square.getPerimeter()).thenReturn(16.0);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ShapeUtils.displayShapeInfo(square);

        String output = outputStream.toString();
        assertTrue(output.contains("Shape kind: Square"));
        assertTrue(output.contains("Shape area: 16.0"));
        assertTrue(output.contains("Shape perimeter: 16.0"));
    }

    @Test
    void testDisplayShapeInfoUnknownShape() {
        Shape unknownShape = Mockito.mock(Shape.class);
        Mockito.when(unknownShape.getArea()).thenReturn(12.0);
        Mockito.when(unknownShape.getPerimeter()).thenReturn(14.0);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ShapeUtils.displayShapeInfo(unknownShape);

        String output = outputStream.toString();
        assertTrue(output.contains("Shape kind: Unknown shape name"));
        assertTrue(output.contains("Shape area: 12.0"));
        assertTrue(output.contains("Shape perimeter: 14.0"));
    }
}