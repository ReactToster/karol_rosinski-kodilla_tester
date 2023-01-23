package com.kodilla.jacoco;

public class Year {
    int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        if (this.year % 4 == 0) {
            if (this.year % 100 == 0) {
                return this.year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
