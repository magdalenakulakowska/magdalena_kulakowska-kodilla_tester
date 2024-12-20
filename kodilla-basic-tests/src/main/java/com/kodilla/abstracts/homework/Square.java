package com.kodilla.abstracts.homework;

public class Square extends Shape{
    private double a;

    public Square (double a) {
        super();
        this.a = a;
    }

    @Override
    public double getArea() {
        double area = a * a;

        System.out.println("Square area: " + area);

        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 4 * a;

        System.out.println("Square perimeter: " + perimeter);

        return perimeter;
    }
}
