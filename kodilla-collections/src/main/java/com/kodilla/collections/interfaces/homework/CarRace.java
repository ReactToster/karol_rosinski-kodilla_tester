package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Opel opel = new Opel();
        doRace(opel);

        Audi audi = new Audi();
        doRace(audi);

        Ferrari ferrari = new Ferrari();
        doRace(ferrari);
    }

    private static void doRace(Car car){
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }
        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }
        System.out.println(car.getSpeed());
    }
}
