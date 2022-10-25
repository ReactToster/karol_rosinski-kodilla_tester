package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(){
        this.cashMachines = new CashMachine[0];
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public void addCashMachine(CashMachine cashMachine) {
        CashMachine[] tempCashMachines = new CashMachine[this.cashMachines.length + 1];
        System.arraycopy(this.cashMachines, 0, tempCashMachines, 0, this.cashMachines.length);
        tempCashMachines[tempCashMachines.length - 1] = cashMachine;
        this.cashMachines = tempCashMachines;
    }

    public void addTransactionToCashMachine(double transaction) {
        this.cashMachines[this.cashMachines.length-1].addTransaction(transaction);
    }

    public void addTransactionToCashMachine(double transaction, int index) {
        this.cashMachines[index].addTransaction(transaction);
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
            count += this.cashMachines[i].amountOfDeposit();
        }
        return count;
    }

    public int amountOfWithdrawal() {
        int count = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            count += this.cashMachines[i].amountOfWithdrawal();
        }
        return count;
    }

    public double averageDeposit() {
        double sum = 0;
        int amountOfDeposit = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += cashMachines[i].sumDeposit();
            amountOfDeposit += cashMachines[i].amountOfDeposit();
        }
        if (amountOfDeposit == 0){
            return 0;
        } else {
            return sum/amountOfDeposit;
        }
    }

    public double averageWithdrawal() {
        double sum = 0;
        int amountOfWithdrawal = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].sumWithdrawal();
            amountOfWithdrawal += this.cashMachines[i].amountOfWithdrawal();
        }
        if (amountOfWithdrawal == 0){
            return 0;
        } else {
            return sum/amountOfWithdrawal;
        }
    }
}
