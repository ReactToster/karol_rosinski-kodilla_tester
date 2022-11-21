package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMISource {
    public static Stream<Arguments> shouldCalculateBMI() {
        return Stream.of(
                Arguments.of(new Person(1.83, 83), "Normal (healthy weight)"),
                Arguments.of(new Person(1.6, 72), "Overweight"),
                Arguments.of(new Person(1.61, 43), "Underweight"),
                Arguments.of(new Person(1.8, 124), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.7, 156), "Obese Class V (Super Obese)")
        );
    }
}
