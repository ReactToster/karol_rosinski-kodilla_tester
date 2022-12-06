package com.kodilla.spring.basic.spring_scopes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class TaskTest {
    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    }

    @Test
    public void shouldCreateDifferentTasks() {
        Task bean1 = context.getBean(Task.class);
        Task bean2 = context.getBean(Task.class);
        Task bean3 = context.getBean(Task.class);
        Assertions.assertNotEquals(bean1, bean2);
        Assertions.assertNotEquals(bean1, bean3);
        Assertions.assertNotEquals(bean3, bean2);
    }
}