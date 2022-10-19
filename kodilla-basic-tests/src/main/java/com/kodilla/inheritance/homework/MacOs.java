package com.kodilla.inheritance.homework;

import javax.crypto.Mac;

public class MacOs extends OperatingSystem {
    public MacOs(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Welcome to MacOs");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off MacOs");
    }
}
