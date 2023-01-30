package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Opel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarUtilsTest {
    private Audi audi;
    private Opel opel;
    private Ferrari ferrari;

    @BeforeEach
    void setUp() {
        audi = new Audi();
        opel = new Opel();
        ferrari = new Ferrari();
    }

    @Test
    void describeCar() {
        CarUtils.describeCar(audi);
        CarUtils.describeCar(opel);
        CarUtils.describeCar(ferrari);
    }

    @Test
    void getCarNameAudi() {
        Assertions.assertEquals("Audi", CarUtils.getCarName(audi));
    }

    @Test
    void getCarNameOpel() {
        Assertions.assertEquals("Opel", CarUtils.getCarName(opel));
    }

    @Test
    void getCarNameFerrari() {
        Assertions.assertEquals("Ferrari", CarUtils.getCarName(ferrari));
    }
}