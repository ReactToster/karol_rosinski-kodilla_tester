package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringManipulatorTestSuite {
    private StringManipulator stringManipulator = new StringManipulator();

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReverseStringWithLowerCase(String input, String expected) {
        assertEquals(expected, stringManipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test, 4", " OtHEr ,5", "E V e n t,5", "null ,4", "A,1"})
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, stringManipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/countNumberOfComas.csv", numLinesToSkip = 1, delimiter = ':')
    public void shouldCountNumberOfCommas(String input, int expected) {
        assertEquals(expected, stringManipulator.countNumberOfCommas(input));
    }
}