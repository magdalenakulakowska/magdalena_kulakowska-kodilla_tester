package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle (double a, double b){
        super();
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        double area = a * b;

        System.out.println("Square area: " + area);

        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * a + 2 * b;

        System.out.println("Square perimeter: " + perimeter);

        return perimeter;
    }
}
