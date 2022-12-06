package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Configuration
public class CarPicker {
    private final DateTimeFormatter formatter;

    public CarPicker() {
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    @Bean
    public Car pickCar() {
        Car car = new DefaultCar();
        if (LocalDate.now().isAfter(LocalDate.parse("01-12-2022", formatter))
                && LocalDate.now().isBefore(LocalDate.parse("19-03-2023", formatter)))
            car = new SUV();
        else if (LocalDate.now().isAfter(LocalDate.parse("22-06-2023", formatter)) &&
                LocalDate.now().isBefore(LocalDate.parse("22-09-2023", formatter))
        )
            car = new Cabrio();
        else if ((LocalDate.now().isAfter(LocalDate.parse("20-03-2023", formatter)) &&
                LocalDate.now().isBefore(LocalDate.parse("21-06-2023", formatter))) ||
                (LocalDate.now().isAfter(LocalDate.parse("23-09-2023", formatter)) &&
                        LocalDate.now().isBefore(LocalDate.parse("30-11-2023", formatter)))
        )
            car = new Sedan();

        return car;
    }
}
