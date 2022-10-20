package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private double r;
    private final double pi = 3.14159265359;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double calculateSurfaceArea() {
        return this.pi * this.r * this.r;
    }

    @Override
    public double calculateCircuit() {
        return 2 * this.pi * this.r;
    }
}
