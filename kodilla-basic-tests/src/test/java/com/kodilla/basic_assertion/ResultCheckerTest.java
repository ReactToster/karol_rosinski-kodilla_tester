package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResultCheckerTest {
    private int number1;
    private int number2;

    @BeforeEach
    void setUp() {
        number1 = 15;
        number2 = 15;
    }

    @Test
    void testResulChecker() {
        Assertions.assertTrue(ResultChecker.assertEquals(number1, number2));
    }
}