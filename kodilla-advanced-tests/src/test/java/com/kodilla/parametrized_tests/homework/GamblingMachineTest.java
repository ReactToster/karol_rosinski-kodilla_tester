package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class GamblingMachineTest {
    private GamblingMachine gamblingMachine;
    private Set<Integer> numbers;

    @BeforeEach
    public void setUp() {
        gamblingMachine = new GamblingMachine();
        numbers = new HashSet<>();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validGamblingMachineNumbers.csv", numLinesToSkip = 1)
    public void shouldCorrectlyValidateNumbers(int validNumber1, int validNumber2, int validNumber3, int validNumber4, int validNumber5, int validNumber6) {
        // given
        numbers.add(validNumber1);
        numbers.add(validNumber2);
        numbers.add(validNumber3);
        numbers.add(validNumber4);
        numbers.add(validNumber5);
        numbers.add(validNumber6);
        // when
        // then
        assertDoesNotThrow(() -> gamblingMachine.howManyWins(numbers));
    }
}