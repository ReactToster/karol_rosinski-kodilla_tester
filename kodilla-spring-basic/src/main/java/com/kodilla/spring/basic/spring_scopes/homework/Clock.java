package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {
    private LocalTime localTime;

    public void updateTime() {
        localTime = LocalTime.now();
    }

    public LocalTime getLocalTime() {
        return localTime;
    }
}
