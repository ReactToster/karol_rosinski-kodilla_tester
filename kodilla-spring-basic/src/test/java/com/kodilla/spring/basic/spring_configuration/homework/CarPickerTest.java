package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CarPickerTest {
    private ApplicationContext context;

    @BeforeEach
    public void setUpContext() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    }

    @Test
    public void shouldReturnSUVDuringWinter() {
        Car suv = (Car) context.getBean("pickCar");

        String carBody = suv.getCarType();
        System.out.println("BodyType: " + carBody + " Local Date: " + LocalDate.now());

        List<String> carPossibleBodies = Arrays.asList("SUV", "Cabrio", "Sedan");
        assertTrue(carPossibleBodies.contains(carBody));
    }

    @ParameterizedTest
    @ValueSource(strings = {"20:01:00", "05:59:00"})
    public void carShouldHaveLightsTurnedOnDuringNight(String time) {
        Car suv = (Car) context.getBean("pickCar");

        assertTrue(suv.hasHeadlightsTurnedOn(LocalTime.parse(time)));
    }

    @ParameterizedTest
    @ValueSource(strings = {"19:59:00", "06:01:00"})
    public void carShouldHaveLightsTurnedOffDuringDay(String time) {
        Car suv = (Car) context.getBean("pickCar");

        assertFalse(suv.hasHeadlightsTurnedOn(LocalTime.parse(time)));
    }


}