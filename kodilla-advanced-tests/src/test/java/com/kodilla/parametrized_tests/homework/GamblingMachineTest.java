package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GamblingMachineTest {
    private GamblingMachine gamblingMachine;
    private Set<Integer> numbers;

    @BeforeEach
    public void setUp() {
        gamblingMachine = new GamblingMachine();
        numbers = new HashSet<>();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validGamblingMachineNumbers.csv", numLinesToSkip = 1, delimiter = ':')
    public void shouldCorrectlyValidateNumbers(String stringNumbers) {
        // given
        String[] strings = stringNumbers.split(",");

        for(String el : strings) {
            numbers.add(Integer.valueOf(el));
        }
        // when
        // then
        assertDoesNotThrow(() -> gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidGamblingMachineNumbers.csv", numLinesToSkip = 1, delimiter = ':')
    public void testHowManyWins_withException(String stringInvalidNumbers) {
        // given
        String[] strings = stringInvalidNumbers.split(",");

        for(String el : strings) {
            numbers.add(Integer.valueOf(el));
        }
        // when
        // then
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }

    @Test
    public void shouldThrowExceptionWhenSizeIsNotCorrect() {
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }
}