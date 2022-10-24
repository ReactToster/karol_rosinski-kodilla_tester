package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;

    public double[] getTransactions() {
        return transactions;
    }

    public CashMachine(double[] transactions){
        this.transactions = transactions;
    }
    public double balance() {
        double sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum+=transactions[i];
        }
        return sum;
    }

    public int amountOfTransactions(){
        return transactions.length;
    }
}
