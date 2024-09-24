package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    CashMachine cashMachine1 = new CashMachine(-10);
    CashMachine cashMachine2 = new CashMachine(-210);
    CashMachine cashMachine3 = new CashMachine(0);

    Bank bank = new Bank();

    @Test
    public void shouldHaveZeroLength() {
        CashMachine[] values = bank.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddThreeCashMachinesToArray () {
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        CashMachine[] values = bank.getValues();
        assertEquals(3, values.length);
        assertEquals(cashMachine1, values[0]);
        assertEquals(cashMachine2, values[1]);
        assertEquals(cashMachine3, values[2]);
    }

    @Test
    public void shouldReturnBalanceEqualsZeroWhenNoCashMachinesAdded () {
        double balance = bank.balance();

        assertEquals(0, balance, 0.0001);
    }

    @Test
    public void shouldReturnCorrectBalanceValue () {
        cashMachine1.deposit(200.45);
        cashMachine1.payout(-15);

        cashMachine2.deposit(10.25);
        cashMachine2.deposit(45.10);
        cashMachine2.payout(-2.50);

        cashMachine3.deposit(13);
        cashMachine3.deposit(155);
        cashMachine3.payout(-1.20);
        cashMachine3.payout(-5);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        double balance = bank.balance();

        assertEquals(400.1, balance, 0.001);
    }

    @Test
    public void shouldHaveZeroDepositTransactionsWhenNoCashMachinesAdded (){
        int depositTransactions = bank.depositTransactionsCount();

        assertEquals(0, depositTransactions);
    }

    @Test
    public void shouldHaveZeroDepositTransactions (){
        cashMachine1.payout(-15);

        cashMachine2.payout(-2.50);

        cashMachine3.payout(-1.20);
        cashMachine3.payout(-5);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        int depositTransactions = bank.depositTransactionsCount();

        assertEquals(0, depositTransactions);
    }

    @Test
    public void shouldHaveFiveDepositTransactions (){
        cashMachine1.deposit(200.45);
        cashMachine1.payout(-15);

        cashMachine2.deposit(10.25);
        cashMachine2.deposit(45.10);
        cashMachine2.payout(-2.50);

        cashMachine3.deposit(13);
        cashMachine3.deposit(155);
        cashMachine3.payout(-1.20);
        cashMachine3.payout(-5);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        int depositTransactions = bank.depositTransactionsCount();

        assertEquals(5, depositTransactions);
    }


    @Test
    public void shouldHaveZeroPayoutTransactionsWhenNoCashMachinesAdded (){
        int depositTransactions = bank.payoutTransactionsCount();

        assertEquals(0, depositTransactions);
    }

    @Test
    public void shouldHaveZeroPayoutTransactions (){
        cashMachine1.deposit(15);

        cashMachine2.deposit(2.50);

        cashMachine3.deposit(1.20);
        cashMachine3.deposit(5);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        int depositTransactions = bank.payoutTransactionsCount();

        assertEquals(0, depositTransactions);
    }

    @Test
    public void shouldHaveFourPayoutTransactions (){
        cashMachine1.deposit(200.45);
        cashMachine1.payout(-15);

        cashMachine2.deposit(10.25);
        cashMachine2.deposit(45.10);
        cashMachine2.payout(-2.50);

        cashMachine3.deposit(13);
        cashMachine3.deposit(155);
        cashMachine3.payout(-1.20);
        cashMachine3.payout(-5);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        int depositTransactions = bank.payoutTransactionsCount();

        assertEquals(4, depositTransactions);
    }

    @Test
    public void shouldHaveDepositAverageEqualsZeroWhenNoCashMachinesAdded () {
        double averageDeposit = bank.averageDepositValue();

        assertEquals(0,averageDeposit, 0.0001 );
    }

    @Test
    public void shouldHaveDepositAverageEqualsZero () {
        cashMachine1.payout(-15);

        cashMachine2.payout(-2.50);

        cashMachine3.payout(-1.20);
        cashMachine3.payout(-5);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        double averageDeposit = bank.averageDepositValue();

        assertEquals(0,averageDeposit, 0.0001 );
    }

    @Test
    public void shouldHaveCorrectDepositAverage () {
        cashMachine1.deposit(200.45);
        cashMachine1.payout(-15);

        cashMachine2.deposit(10.25);
        cashMachine2.deposit(45.10);
        cashMachine2.payout(-2.50);

        cashMachine3.deposit(13);
        cashMachine3.deposit(155);
        cashMachine3.payout(-1.20);
        cashMachine3.payout(-5);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        double averageDeposit = bank.averageDepositValue();

        assertEquals(84.76, averageDeposit, 0.0001 );
    }

    @Test
    public void shouldHavePayoutAverageEqualsZeroWhenNoCashMachinesAdded () {
        double averagePayout = bank.averagePayoutValue();

        assertEquals(0, averagePayout, 0.0001 );
    }

    @Test
    public void shouldHavePayoutAverageEqualsZero () {
        cashMachine1.deposit(15);

        cashMachine2.deposit(2.50);

        cashMachine3.deposit(1.20);
        cashMachine3.deposit(5);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        double averagePayout = bank.averagePayoutValue();

        assertEquals(0,averagePayout, 0.0001 );
    }

    @Test
    public void shouldHaveCorrectPayoutAverage () {
        cashMachine1.deposit(200.45);
        cashMachine1.payout(-15);

        cashMachine2.deposit(10.25);
        cashMachine2.deposit(45.10);
        cashMachine2.payout(-2.50);

        cashMachine3.deposit(13);
        cashMachine3.deposit(155);
        cashMachine3.payout(-1.20);
        cashMachine3.payout(-5);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        double averagePayout = bank.averagePayoutValue();

        assertEquals(-5.925, averagePayout, 0.0001 );
    }
}
