package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class CalculatorTest {
    private ApplicationContext context;
    private Display display;
    private Calculator calculator;

    @BeforeEach
    public void setUpApplicationContext() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        display = context.getBean(Display.class);
        calculator = context.getBean(Calculator.class);
    }

    @Test
    void add() {
        Assertions.assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void subtract() {
        Assertions.assertEquals(0, calculator.subtract(2, 2));
    }

    @Test
    void multiply() {
        Assertions.assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    void divide() {
        Assertions.assertEquals(1, calculator.divide(2, 2));
    }
}