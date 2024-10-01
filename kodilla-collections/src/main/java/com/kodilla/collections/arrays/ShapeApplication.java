package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapes = new Shape[random.nextInt(20) + 1];

        for ( int i=0; i < shapes.length; i++ )
            shapes[i] = drawShape();

        for ( Shape shape : shapes )
            ShapeUtils.displayShapeInfo(shape);
    }

    private static Shape drawShape() {
        Random random = new Random();
        int drawnShapeKind = random.nextInt(3);
        double a = getRandomSize(random);
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else {
            double b = getRandomSize(random);
            double c = getRandomSize(random);
            return new Triangle(a, b, c);
        }
    }

    private static double getRandomSize (Random random){
        return random.nextDouble() * 100 + 1;
    }
}
