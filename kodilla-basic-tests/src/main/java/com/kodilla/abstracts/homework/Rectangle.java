package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculateSurfaceArea() {
        return this.a * this.b;
    }

    @Override
    public double calculateCircuit() {
        return 2 * this.a + 2 * this.b;
    }
}
