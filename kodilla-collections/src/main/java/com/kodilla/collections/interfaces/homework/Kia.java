package com.kodilla.collections.interfaces.homework;

public class Kia implements Car{
    int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 18;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 11;
    }
}
