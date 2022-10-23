package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.add(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 19;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-11, subtractResult);
    }

    @Test
    public void testExponentiation() {
        Calculator calculator = new Calculator();
        double a = 2;
        double b = -2;
        double c = 0;
        double positiveExponentiationResult = calculator.exponentiation(a);
        assertEquals(4, positiveExponentiationResult, 0.01);

        double negativeExponentiationResult = calculator.exponentiation(b);
        assertEquals(4, negativeExponentiationResult, 0.01);

        double zeroExponentiationResult = calculator.exponentiation(c);
        assertEquals(0, zeroExponentiationResult, 0.01);
    }
}
