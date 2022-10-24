package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;

    public double getTransaction(int index) {
        return this.transactions[index];
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
