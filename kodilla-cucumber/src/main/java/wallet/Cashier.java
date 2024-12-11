package wallet;

public class Cashier {
    private final CashSlot cashSlot;
    private String message;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        int balance = wallet.getBalance();

        if(balance < amount || amount < 0 || balance == 0) {
            cashSlot.dispense(0);
            wallet.debit(0);
            message = "You don't have enough money in your wallet";
        } else {
            cashSlot.dispense(amount);
            wallet.debit(amount);
        }
    }

    public String getMessage() {
        return message;
    }
}
