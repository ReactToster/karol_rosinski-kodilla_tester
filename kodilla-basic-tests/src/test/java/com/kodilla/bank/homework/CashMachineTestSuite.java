package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine(new double[0]);
        assertEquals(0, cashMachine.amountOfTransactions());
    }

    @Test
    public void shouldCalculateBalance() {
        CashMachine cashMachine = new CashMachine(new double[]{1000, -100, 8100, -2300});
        assertEquals(6700, cashMachine.balance());
    }
}
