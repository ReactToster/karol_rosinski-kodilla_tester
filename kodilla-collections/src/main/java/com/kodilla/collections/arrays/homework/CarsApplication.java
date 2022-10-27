package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[RANDOM.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        for (Car car :
                cars) {
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar(){
        int drawnCarKind = RANDOM.nextInt(3);
        
        switch (drawnCarKind) {
            case 0:
                Opel opel = new Opel();
                randomSpeedIncrease(opel);
                return opel;
            case 1:
                Audi audi = new Audi();
                randomSpeedIncrease(audi);
                return audi;
            case 2:
                Ferrari ferrari = new Ferrari();
                randomSpeedIncrease(ferrari);
                return ferrari;
            default:
                return null;
        }
    }
    
    public static void randomSpeedIncrease(Car car){
        for (int i = 0; i < (RANDOM.nextInt(20) + 1); i++) {
            car.increaseSpeed();
        }
    }
}
