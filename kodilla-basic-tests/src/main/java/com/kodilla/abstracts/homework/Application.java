package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Square's area: " + square.calculateSurfaceArea() + " and circuit: " + square.calculateCircuit());

        Circle circle = new Circle(5);
        System.out.println("Circle's area: " + circle.calculateSurfaceArea() + " and circuit: " + circle.calculateCircuit());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle's area: " + rectangle.calculateSurfaceArea() + " and circuit: " + rectangle.calculateCircuit());
    }
}
