package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem (int year) {
        this.year = year;
    }

    public void turnOn () {
        System.out.println("System was turned on");
    }

    public void turnOff () {
        System.out.println("System was turned off");
    }

    public int getYear() {
        return year;
    }

    public void displayYear() {
        System.out.println("Release year:" + year);
    }
}
