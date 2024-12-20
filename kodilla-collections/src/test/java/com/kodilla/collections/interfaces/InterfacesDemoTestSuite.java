package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class InterfacesDemoTestSuite {

    @Test
    void testShowShapeDetailsSquare() {
        Shape square = new Square(10.0);

        InterfacesDemo.showShapeDetails(square);

        assertEquals(100.0, square.getArea());
        assertEquals(40.0, square.getPerimeter());
    }

    @Test
    void testShowShapeDetailsCircle() {
        Shape circle = new Circle(7.0);

        InterfacesDemo.showShapeDetails(circle);

        assertEquals(153.938040, circle.getArea(), 0.001);
        assertEquals(43.982297, circle.getPerimeter(), 0.001);
    }

    @Test
    void testShowShapeDetailsWithTriangle() {
        Shape triangle = new Triangle(6.0, 4.0, 7.211);

        InterfacesDemo.showShapeDetails(triangle);

        assertEquals(12.0, triangle.getArea());
        assertEquals(17.211, triangle.getPerimeter(), 0.001);
    }

    @Test
    void testShowShapeDetailsWithMockedShape() {
        Shape mockedShape = Mockito.mock(Shape.class);
        when(mockedShape.getArea()).thenReturn(50.0);
        when(mockedShape.getPerimeter()).thenReturn(30.0);

        InterfacesDemo.showShapeDetails(mockedShape);

        verify(mockedShape, times(1)).getArea();
        verify(mockedShape, times(1)).getPerimeter();
    }
}