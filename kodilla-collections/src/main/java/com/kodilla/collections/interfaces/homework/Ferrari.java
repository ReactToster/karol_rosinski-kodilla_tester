package com.kodilla.collections.interfaces.homework;

public class Ferrari implements Car{
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 35;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 50;
    }
}
