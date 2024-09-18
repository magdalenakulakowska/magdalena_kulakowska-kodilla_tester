package com.kodilla.abstracts.homework;

public class Square extends Shape{
    private double a;

    public Square (double a) {
        super();
        this.a = a;
    }

    @Override
    public void getArea() {
        double area = a * a;

        System.out.println("Square area: " + area);
    }

    @Override
    public void getPerimeter() {
        double perimeter = 4 * a;

        System.out.println("Square perimeter: " + perimeter);
    }
}
