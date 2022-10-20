package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateSurfaceArea() {
        return this.a * this.a;
    }

    @Override
    public double calculateCircuit() {
        return 4 * this.a;
    }
}
