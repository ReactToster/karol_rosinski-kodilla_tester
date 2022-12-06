package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {
        if(time.isAfter(LocalTime.parse("20:00:00")) && time.isBefore(LocalTime.parse("06:00:00")))
            return true;
        else
            return false;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
