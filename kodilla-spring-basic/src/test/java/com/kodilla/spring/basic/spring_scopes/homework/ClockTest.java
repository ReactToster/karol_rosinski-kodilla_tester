package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ClockTest {
    private ApplicationContext context;

    @BeforeEach
    public void setUpContext() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    }

    @Test
    public void timesOfTwoClockBeansShouldBeDifferent() {
        Clock clock = context.getBean(Clock.class);
        clock.updateTime();
        Clock clock1 = context.getBean(Clock.class);
        clock1.updateTime();

        Assertions.assertNotEquals(clock.getLocalTime(), clock1.getLocalTime());
    }
}