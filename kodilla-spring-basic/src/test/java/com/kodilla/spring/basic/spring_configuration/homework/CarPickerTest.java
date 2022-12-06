package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CarPickerTest {
    @Test
    public void shouldReturnSUVDuringWinter() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car car = (Car) context.getBean("pickCar");

        String carBody = car.getCarType();
        System.out.println("BodyType: " + carBody + " Local Date: " + LocalDate.now());

        List<String> carPossibleBodies = Arrays.asList("SUV", "Cabrio", "Sedan");
        assertTrue(carPossibleBodies.contains(carBody));
    }


}