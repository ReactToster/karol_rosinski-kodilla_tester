package com.kodilla.collections.adv.immutable.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskTest {

    private Task task;
    private String title;
    private int duration;

    @BeforeEach
    void setUp() {
        title = "Test Title";
        duration = 9999;
        task = new Task(title, duration);
    }

    @Test
    void getTitle() {
        Assertions.assertEquals(title, task.getTitle());
    }

    @Test
    void getDuration() {
        Assertions.assertEquals(duration, task.getDuration());
    }
}