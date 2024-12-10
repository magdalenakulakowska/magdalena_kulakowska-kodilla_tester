package wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        int balance = wallet.getBalance();

        if(balance < amount || amount < 0 || balance == 0) {
            cashSlot.dispense(0);
        } else {
            cashSlot.dispense(amount);
        }
    }
}
