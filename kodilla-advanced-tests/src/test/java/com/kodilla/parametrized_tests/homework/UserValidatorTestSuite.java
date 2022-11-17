package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"black.adam", "crazy_coder", "111", "aaa", "aaa5"})
    public void shouldReturnTrueForCorrectUsername(String input){
        assertTrue(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ba", "s", "@@@", "???", "name!!"})
    public void shouldReturnFalseForIncorrectUsername(String input) {
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseForEmptyUsername(String input) {
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"black.adam@gmail.com", "111.222@222.com", "---.___@---.com", "adam@gmail.com"})
    public void shouldReturnTrueForCorrectEmail(String input) {
        assertTrue(userValidator.validateEmail(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"??.??@gmail.com", "@222.com", "aaaaa@.com", "aaaaa@", "adam", "@"})
    public void shouldReturnFalseForIncorrectEmail(String input) {
        assertFalse(userValidator.validateEmail(input));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseForEmptyEmail(String input) {
        assertFalse(userValidator.validateEmail(input));
    }
}