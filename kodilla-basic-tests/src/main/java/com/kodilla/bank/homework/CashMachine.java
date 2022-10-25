package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;

    public CashMachine() {
        this.transactions = new double[0];
    }

    public void addTransaction(double transaction) {
        double[] tempTransactions = new double[amountOfTransactions() + 1];
        System.arraycopy(this.transactions, 0, tempTransactions, 0, amountOfTransactions());
        tempTransactions[tempTransactions.length - 1] = transaction;
        this.transactions = tempTransactions;
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

    public double sumDeposit() {
        double sumDeposit = 0;
        for (int i = 0; i < amountOfTransactions(); i++) {
            if (this.transactions[i] > 0){
                sumDeposit += this.transactions[i];
            }
        }
        return sumDeposit;
    }

    public double sumWithdrawal() {
        double sumWithdrawal = 0;
        for (int i = 0; i < amountOfTransactions(); i++) {
            if (this.transactions[i] < 0){
                sumWithdrawal += this.transactions[i];
            }
        }
        return sumWithdrawal;
    }

    public int amountOfDeposit() {
        int amount = 0;
        for (int i = 0; i < amountOfTransactions(); i++) {
            if(this.transactions[i] > 0) {
                amount++;
            }
        }
        return amount;
    }

    public int amountOfWithdrawal() {
        int amount = 0;
        for (int i = 0; i < amountOfTransactions(); i++) {
            if(this.transactions[i] < 0) {
                amount++;
            }
        }
        return amount;
    }
}
