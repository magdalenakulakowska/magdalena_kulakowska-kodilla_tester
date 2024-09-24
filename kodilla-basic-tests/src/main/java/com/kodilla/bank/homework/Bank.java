package com.kodilla.bank.homework;

public class Bank {
    private int size;
    private CashMachine[] values;

    public Bank (){
        this.size = 0;
        this.values = new CashMachine[0];
    }

    public void addCashMachine(CashMachine value) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public double balance() {
        double balance = 0;

        for(int i = 0; i < this.values.length; i++){
            balance += this.values[i].accountBalance();
        }

        return balance;
    }

    public int depositTransactionsCount() {
        int count = 0;

        for(int i = 0; i < this.values.length; i++){
            double[] cashMachineValues = this.values[i].getValues();

            for(int j=0; j< cashMachineValues.length; j++){
                if(cashMachineValues[j] > 0){
                    count++;
                }
            }
        }

        return count;
    }

    public int payoutTransactionsCount() {
        int count = 0;

        for(int i = 0; i < this.values.length; i++){
            double[] cashMachineValues = this.values[i].getValues();

            for(int j=0; j<cashMachineValues.length; j++){
                if(cashMachineValues[j] < 0){
                    count++;
                }
            }
        }

        return count;
    }

    public double averageDepositValue(){
        int count = 0;
        double sum = 0;
        double average;

        for(int i = 0; i < this.values.length; i++){
            double[] cashMachineValues = this.values[i].getValues();

            for(int j=0; j< cashMachineValues.length; j++){
                double value = cashMachineValues[j];

                if(value > 0){
                    sum += value;
                    count++;
                }
            }
        }

        average = sum > 0 ? sum/count : 0;

        return average;
    }

    public double averagePayoutValue(){
        int count = 0;
        double sum = 0;
        double average;

        for(int i = 0; i < this.values.length; i++){
            double[] cashMachineValues = this.values[i].getValues();

            for(int j=0; j<cashMachineValues.length; j++){
                double value = cashMachineValues[j];

                if(value < 0){
                    sum += value;
                    count++;
                }
            }
        }

        average = sum < 0 ? sum/count : 0;

        return average;
    }

    public CashMachine[] getValues() {
        return values;
    }
}
