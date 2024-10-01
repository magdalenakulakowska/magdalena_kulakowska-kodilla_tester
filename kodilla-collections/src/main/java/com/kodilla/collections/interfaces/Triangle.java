package com.kodilla.collections.interfaces;

import java.util.Objects;

public class Triangle implements Shape{
    double height;
    double width;
    double hypotenuse;

    public Triangle (double height, double width, double hypotenuse){
        this.height = height;
        this.width = width;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return height * width / 2;
    }

    @Override
    public double getPerimeter() {
        return height + width + hypotenuse;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", hypotenuse=" + hypotenuse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(height, triangle.height) == 0 && Double.compare(width, triangle.width) == 0 && Double.compare(hypotenuse, triangle.hypotenuse) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, hypotenuse);
    }
}
