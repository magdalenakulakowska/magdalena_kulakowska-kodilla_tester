package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    static final double PI = 3.1415927;
    private double r;

    public Circle (double r) {
        super();

        this.r = r;
    }

    @Override
    public void getArea() {
        double area = PI * r * r;

        System.out.println("Circle area: " + area);
    }

    @Override
    public void getPerimeter() {
        double perimeter = 2 * PI *r;

        System.out.println("Circle perimeter: " + perimeter);
    }
}
