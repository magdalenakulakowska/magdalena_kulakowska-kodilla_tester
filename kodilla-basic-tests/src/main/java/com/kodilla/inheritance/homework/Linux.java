package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem{
    public Linux (int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("System Linux was turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("System Linux was turned off");
    }
}
