package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car {
    LocalTime currentTime;

    public Sedan(LocalTime currentTime) {
        this.currentTime = currentTime;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return currentTime.isAfter(LocalTime.of(20,0)) || currentTime.isBefore(LocalTime.of(6,0));
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
