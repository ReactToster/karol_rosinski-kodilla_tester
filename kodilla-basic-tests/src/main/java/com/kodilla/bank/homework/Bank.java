package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines){
        this.cashMachines = cashMachines;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public void addCashMachine(CashMachine cashMachine) {
        CashMachine[] newCashMachines = new CashMachine[this.cashMachines.length + 1];
        System.arraycopy(this.cashMachines, 0, newCashMachines, 0, this.cashMachines.length);
        newCashMachines[newCashMachines.length - 1] = cashMachine;
        this.cashMachines = newCashMachines;
    }

    public double finalBalance() {
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
                sum+= this.cashMachines[i].balance();
        }
        return sum;
    }

    public int amountOfDeposit() {
        int count = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            for (int j = 0; j < this.cashMachines[i].amountOfTransactions(); j++) {
                if(cashMachines[i].getTransactions()[j] > 0){
                    count++;
                }
            }
        }
        return count;
    }

    public int amountOfWithdrawal() {
        int count = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            for (int j = 0; j < this.cashMachines[i].amountOfTransactions(); j++) {
                if(cashMachines[i].getTransactions()[j] < 0){
                    count++;
                }
            }
        }
        return count;
    }

    public double averageDeposit() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            for (int j = 0; j < this.cashMachines[i].amountOfTransactions(); j++) {
                if(cashMachines[i].getTransactions()[j] > 0){
                    sum+=cashMachines[i].getTransactions()[j];
                    count++;
                }
            }
        }
        if (count == 0){
            return 0;
        } else {
            return sum/count;
        }
    }

    public double averageWithdrawal() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            for (int j = 0; j < this.cashMachines[i].amountOfTransactions(); j++) {
                if(cashMachines[i].getTransactions()[j] < 0){
                    sum+=cashMachines[i].getTransactions()[j];
                    count++;
                }
            }
        }
        if (count == 0){
            return 0;
        } else {
            return sum/count;
        }
    }
}
