package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(4.2);
        square.getArea();
        square.getPerimeter();

        Rectangle rectangle = new Rectangle(3,2);
        rectangle.getArea();
        rectangle.getPerimeter();

        Circle circle = new Circle(2);
        circle.getArea();
        circle.getPerimeter();

        JavaTester javaTester = new JavaTester();
        Person person1 = new Person("Andrzej", 32, javaTester);
        person1.displayResponsibilities();

        Seller seller = new Seller();
        Person person2 = new Person("Joanna", 55, seller);
        person2.displayResponsibilities();

        HairDresser hairDresser = new HairDresser();
        Person person3 = new Person("Jacek", 25, hairDresser);
        person3.displayResponsibilities();
    }
}
