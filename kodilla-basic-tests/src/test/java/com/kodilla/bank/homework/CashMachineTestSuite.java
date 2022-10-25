package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.amountOfTransactions());
    }

    @Test
    public void shouldCalculateBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(1000);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(8100);
        cashMachine.addTransaction(-2300);
        assertEquals(6700, cashMachine.balance());
    }

    @Test
    public void shouldAdd2TransactionsToArray(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(200);
        assertEquals(2, cashMachine.amountOfTransactions());
    }
}
