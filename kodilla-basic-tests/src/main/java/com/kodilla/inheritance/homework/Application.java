package com.kodilla.inheritance.homework;

public class Application {
    public static void main (String[] args){
        OperatingSystem operatingSystem = new OperatingSystem(1956);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        operatingSystem.displayYear();

        Windows windows = new Windows(1985);
        windows.turnOn();
        windows.turnOff();
        windows.displayYear();

        Linux linux = new Linux(1991);
        linux.turnOn();
        linux.turnOff();
        linux.displayYear();
    }
}
