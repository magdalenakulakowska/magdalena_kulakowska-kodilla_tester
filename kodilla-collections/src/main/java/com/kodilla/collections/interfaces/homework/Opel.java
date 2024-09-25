package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 22;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 8;
    }
}
