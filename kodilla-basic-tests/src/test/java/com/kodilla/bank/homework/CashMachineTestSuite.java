package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    CashMachine cashMachine = new CashMachine(-200);

    @Test
    public void shouldHaveZeroLength() {
        double[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddOneDepositTransactionAndOnePayoutTransactionToArray () {
        cashMachine.deposit(200.45);
        cashMachine.payout(-15);

        double[] values = cashMachine.getValues();
        assertEquals(2, values.length);
        assertEquals(200.45, values[0], 0.0001);
        assertEquals(-15, values[1], 0.0001);
    }

    @Test
    public void shouldNotAddNewDepositTransactionWhenZeroIsPassed(){
        cashMachine.deposit(0);

        double[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldNotAddNewPayoutTransactionWhenZeroIsPassed(){
        cashMachine.payout(0);

        double[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldNotPassNegativeNumberInDepositTransaction(){
        cashMachine.deposit(-40);

        double[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldNotPassPositiveNumberInPayoutTransaction(){
        cashMachine.payout(40);

        double[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldHaveRoundedValuesToTwoDecimalsWhenDeposit(){
        cashMachine.deposit(200.45123);

        double[] values = cashMachine.getValues();
        assertEquals(200.45, values[0], 0.0001);
    }

    @Test
    public void shouldHaveRoundedValuesToTwoDecimalsWhenPayout(){
        cashMachine.payout(-50.45123);

        double[] values = cashMachine.getValues();
        assertEquals(-50.45, values[0], 0.0001);
    }

    @Test
    public void shouldNotPayoutMoreMoneyThanDebitAllows(){
        cashMachine.payout(-500);

        double[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldReturnAccountBalanceEqualsZeroIfArrayIsEmpty() {
        double balance = cashMachine.accountBalance();

        assertEquals(0, balance, 0.0001);
    }

    @Test
    public void shouldReturnCorrectAccountBalance(){
        cashMachine.payout(-5.50);
        cashMachine.deposit(15);
        cashMachine.deposit(200.45123);
        cashMachine.payout(-36);

        double balance = cashMachine.accountBalance();

        assertEquals(173.95, balance, 0.0001);
    }

    @Test
    public void shouldReturnZeroTransactionsCount(){
        double transactionsCount = cashMachine.getTransactionsCount();

        assertEquals(0, transactionsCount, 0.0001);
    }

    @Test
    public void shouldReturnFourTransactionsCount(){
        cashMachine.payout(-5.50);
        cashMachine.deposit(15);
        cashMachine.deposit(200.45123);
        cashMachine.payout(-36);

        double transactionsCount = cashMachine.getTransactionsCount();

        assertEquals(4, transactionsCount, 0.0001);
    }

    @Test
    public void shouldDebitEqualsZeroWhenPassedDebitIsBiggerThanZero(){
        CashMachine cashMachine = new CashMachine(200);

        double debit = cashMachine.getDebit();

        assertEquals(0, debit, 0.0001);
    }
}
