package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        Bank bank = new Bank();
        assertEquals(0, bank.amountOfCashMachines());
    }

    @Test
    public void shouldAdd3CashMachinesToArray() {
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());
        assertEquals(3, bank.amountOfCashMachines());
    }

    @Test
    public void shouldCalculateFinalBalance() {
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(-200);
        bank.addTransactionToCashMachine(300);
        bank.addTransactionToCashMachine(200);
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(100);
        bank.addTransactionToCashMachine(300);
        bank.addTransactionToCashMachine(200);
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(200);
        bank.addTransactionToCashMachine(300);
        bank.addTransactionToCashMachine(200);
        assertEquals(1600, bank.finalBalance());
    }

    @Test
    public void shouldCalculateAverageDeposit() {
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(200);
        bank.addTransactionToCashMachine(-300);
        bank.addTransactionToCashMachine(-400);
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(300);
        bank.addTransactionToCashMachine(300);
        bank.addTransactionToCashMachine(-400);
        assertEquals(266.66, bank.averageDeposit(), 0.01);
    }

    @Test
    public void shouldCorrectlyCalculateAverageDepositIfZeroDeposits(){
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(-200);
        bank.addTransactionToCashMachine(-300);
        bank.addTransactionToCashMachine(-400);
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(-300);
        bank.addTransactionToCashMachine(-300);
        bank.addTransactionToCashMachine(-400);
        assertEquals(0, bank.averageDeposit());
    }

    @Test
    public void shouldCalculateAverageWithdrawal() {
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(200);
        bank.addTransactionToCashMachine(-300);
        bank.addTransactionToCashMachine(400);
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(300);
        bank.addTransactionToCashMachine(-300);
        bank.addTransactionToCashMachine(-400);
        assertEquals(-333.33, bank.averageWithdrawal(), 0.01);
    }

    @Test
    public void shouldCorrectlyCalculateAverageWithdrawalIfZeroWithdrawals(){
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(200);
        bank.addTransactionToCashMachine(300);
        bank.addTransactionToCashMachine(400);
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(300);
        bank.addTransactionToCashMachine(300);
        bank.addTransactionToCashMachine(400);
        assertEquals(0, bank.averageWithdrawal());
    }

    @Test
    public void shouldCalculateAmountOfDeposits() {
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(200);
        bank.addTransactionToCashMachine(300);
        bank.addTransactionToCashMachine(400);
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(300);
        bank.addTransactionToCashMachine(300);
        bank.addTransactionToCashMachine(400);
        assertEquals(6, bank.amountOfDeposit());
    }

    @Test
    public void shouldCalculateAmountOfWithdrawal() {
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(200);
        bank.addTransactionToCashMachine(-300);
        bank.addTransactionToCashMachine(400);
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(300);
        bank.addTransactionToCashMachine(-300);
        bank.addTransactionToCashMachine(-400);
        assertEquals(3, bank.amountOfWithdrawal());
    }

    @Test
    public void shouldNotAddTransactionToCashMachineIfTransactionIs0(){
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addTransactionToCashMachine(0);
        assertEquals(0, bank.amountOfTransactions());
    }

    @Test
    public void shouldNotAddTransactionToCashMachineIfThereIsNoCashMachine(){
        Bank bank = new Bank();
        bank.addTransactionToCashMachine(1000);
        assertEquals(0, bank.amountOfCashMachines());
    }
}
