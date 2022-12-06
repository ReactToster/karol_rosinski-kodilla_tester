package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Configuration
public class CarPicker {
    private DateTimeFormatter formatter;

    public CarPicker() {
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    @Bean
    public Car pickCar() {
        if (LocalDate.now().isAfter(LocalDate.parse("01-12-2022", formatter)) && LocalDate.now().isBefore(LocalDate.parse("19-03-2023", formatter)))
            return new SUV();
        return null;
    }
}
