package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        Bank bank = new Bank(new CashMachine[0]);
        assertEquals(0, bank.getCashMachines().length);
    }

    @Test
    public void shouldAdd3CashMachinesToArray() {
        Bank bank = new Bank(new CashMachine[]{});
        bank.addCashMachine(new CashMachine(new double[]{200, 300, 200}));
        bank.addCashMachine(new CashMachine(new double[]{100, 300, 200}));
        bank.addCashMachine(new CashMachine(new double[]{300, 300, 200}));
        assertEquals(3, bank.getCashMachines().length);
    }

    @Test
    public void shouldCalculateFinalBalance() {
        Bank bank = new Bank(new CashMachine[]{});
        bank.addCashMachine(new CashMachine(new double[]{200, 300, 200}));
        bank.addCashMachine(new CashMachine(new double[]{100, 300, 200}));
        bank.addCashMachine(new CashMachine(new double[]{300, 300, 200}));
        assertEquals(2100, bank.finalBalance());
    }

    @Test
    public void shouldCalculateAverageDeposit() {
        Bank bank = new Bank(new CashMachine[]{});
        bank.addCashMachine(new CashMachine(new double[]{-200, 300, 200}));
        bank.addCashMachine(new CashMachine(new double[]{-100, 300, 200}));
        bank.addCashMachine(new CashMachine(new double[]{-300, 300, 200}));
        assertEquals(250, bank.averageDeposit());
    }

    @Test
    public void shouldCorrectlyCalculateAverageDepositIfZeroDeposits(){
        Bank bank = new Bank(new CashMachine[]{});
        bank.addCashMachine(new CashMachine(new double[]{-200, -300, -200}));
        bank.addCashMachine(new CashMachine(new double[]{-100, -300, -200}));
        bank.addCashMachine(new CashMachine(new double[]{-300, -300, -200}));
        assertEquals(0, bank.averageDeposit());
    }

    @Test
    public void shouldCalculateAverageWithdrawal() {
        Bank bank = new Bank(new CashMachine[]{});
        bank.addCashMachine(new CashMachine(new double[]{-200, 300, 200}));
        bank.addCashMachine(new CashMachine(new double[]{-100, 300, 200}));
        bank.addCashMachine(new CashMachine(new double[]{-300, 300, 200}));
        assertEquals(-200, bank.averageWithdrawal());
    }

    @Test
    public void shouldCorrectlyCalculateAverageWithdrawalIfZeroWithdrawals(){
        Bank bank = new Bank(new CashMachine[]{});
        bank.addCashMachine(new CashMachine(new double[]{200, 300, 200}));
        bank.addCashMachine(new CashMachine(new double[]{100, 300, 200}));
        bank.addCashMachine(new CashMachine(new double[]{300, 300, 200}));
        assertEquals(0, bank.averageWithdrawal());
    }

    @Test
    public void shouldCalculateAmountOfDeposits() {
        Bank bank = new Bank(new CashMachine[]{});
        bank.addCashMachine(new CashMachine(new double[]{-200, 300, 200}));
        bank.addCashMachine(new CashMachine(new double[]{-100, 300, 200}));
        bank.addCashMachine(new CashMachine(new double[]{-300, 300, 200}));
        assertEquals(6, bank.amountOfDeposit());
    }

    @Test
    public void shouldCalculateAmountOfWithdrawal() {
        Bank bank = new Bank(new CashMachine[]{});
        bank.addCashMachine(new CashMachine(new double[]{-200, 300, 200}));
        bank.addCashMachine(new CashMachine(new double[]{-100, 300, 200}));
        bank.addCashMachine(new CashMachine(new double[]{-300, 300, 200}));
        assertEquals(3, bank.amountOfWithdrawal());
    }
}
