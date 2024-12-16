package com.kodilla.jacoco;

public class LeapYear {
    int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        if (this.year % 4 == 0) {
            if (this.year % 100 == 0) {
                if (this.year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
