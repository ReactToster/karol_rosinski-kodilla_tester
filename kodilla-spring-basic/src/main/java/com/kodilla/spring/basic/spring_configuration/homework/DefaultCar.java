package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class DefaultCar implements Car {
    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {
        return false;
    }

    @Override
    public String getCarType() {
        return "Default";
    }
}
