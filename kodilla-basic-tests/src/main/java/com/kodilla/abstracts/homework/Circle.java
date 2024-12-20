package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    private double r;

    public Circle (double r) {
        super();

        this.r = r;
    }

    @Override
    public double getArea() {
        double area = Math.PI * r * r;

        System.out.println("Circle area: " + area);

        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI *r;

        System.out.println("Circle perimeter: " + perimeter);

        return perimeter;
    }
}
