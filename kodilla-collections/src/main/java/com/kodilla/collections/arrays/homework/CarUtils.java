package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("-------------------------");
        System.out.println("Car's name: " + getCarName(car));
        System.out.println("speed: " + car.getSpeed());
    }

    public static String getCarName(Car car){
        if (car instanceof Opel)
            return "Opel";
        else if(car instanceof Audi)
            return "Audi";
        else if(car instanceof Ferrari)
            return "Ferrari";
        else
            return "Unknown Car name";
    }
}
