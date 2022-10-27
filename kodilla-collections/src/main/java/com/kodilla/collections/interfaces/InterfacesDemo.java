package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Square square = new Square(10.0);
        showShapeDetails(square);

        Circle circle = new Circle(7);
        showShapeDetails(circle);

        Triangle triangle = new Triangle(2, 4, 8);
        showShapeDetails(triangle);
    }

    private static void showShapeDetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
