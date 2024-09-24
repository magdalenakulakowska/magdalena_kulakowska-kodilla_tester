package com.kodilla.bank.homework;

import java.text.DecimalFormat;

public class CashMachine {
    private int size;
    private double[] values;
    private double debit;

    public CashMachine(double debit) {
        this.size = 0;
        this.values = new double[0];
        this.debit = debit > 0 ? 0 : debit;
    }

    private void updateArray(double value){
        this.size++;
        double[] newTab = new double[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public void deposit(double value) {
        if(value <= 0){
            return;
        }

        double roundVal = Math.round(value*100.0)/100.0;

        updateArray(roundVal);
    }

    public void payout(double value) {
        if (value >= 0){
            return;
        }

        if((accountBalance() + value) < this.debit) {
            return;
        }

        double roundVal = Math.round(value*100.0)/100.0;

        updateArray(roundVal);
    }

    public double accountBalance() {
        double balance = 0;

        for(int i = 0; i < this.values.length; i++){
            balance += this.values[i];
        }

        return balance;
    }

    public int getTransactionsCount() {
        return this.values.length;
    }

    public double[] getValues() {
        return values;
    }

    public double getDebit() {
        return this.debit;
    }
}
