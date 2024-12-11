package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals(200, wallet.getBalance(),"Incorrect wallet balance");
    }

    @When("I request $30")
    public void i_request_$30() {
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        assertEquals(30, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be $170")
    public void the_balance_of_my_wallet_should_be_$170() {
        assertEquals(170,  wallet.getBalance(), "Incorrect wallet balance");
    }

    @Given("I have deposited $50 in my wallet")
    public void i_have_deposited_$50_in_my_wallet() {
        wallet.deposit(50);
        assertEquals(50, wallet.getBalance(),"Incorrect wallet balance");
    }

    @When("I request $50")
    public void i_request_$50() {
        cashier.withdraw(wallet, 50);
    }

    @Then("$50 should be dispensed")
    public void $50_should_be_dispensed() {
        assertEquals(50, cashSlot.getContents());
    }

    @Given("I have deposited $40 in my wallet")
    public void i_have_deposited_$40_in_my_wallet() {
        wallet.deposit(40);
        assertEquals(40, wallet.getBalance(),"Incorrect wallet balance");
    }

    @When("I request $60")
    public void i_request_$60() {
        cashier.withdraw(wallet, 60);
    }

    @Then("no money should be dispensed when withdraw is bigger than balance")
    public void no_money_should_be_dispensed_when_withdraw_is_bigger_than_balance() {
        assertEquals(0, cashSlot.getContents());
    }

    @Given("I have deposited $100 in my wallet")
    public void i_have_deposited_$100_in_my_wallet() {
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance(),"Incorrect wallet balance");
    }

    @When("I request $0")
    public void i_request_$0() {
        cashier.withdraw(wallet, 0);
    }

    @Then("no money should be dispensed when withdraw $0")
    public void no_money_should_be_dispensed_when_withdraw_$0() {
        assertEquals(0, cashSlot.getContents());
        assertEquals(100, wallet.getBalance());
    }

    @Given("I have deposited $160 in my wallet")
    public void i_have_deposited_$160_in_my_wallet() {
        wallet.deposit(160);
        assertEquals(160, wallet.getBalance(),"Incorrect wallet balance");
    }

    @When("I request -$10")
    public void i_request_negative_$10() {
        cashier.withdraw(wallet, -10);
    }

    @Then("no money should be dispensed when withdraw is negative number")
    public void no_money_should_be_dispensed_when_withdraw_is_negative_number() {
        assertEquals(0, cashSlot.getContents());
        assertEquals(160, wallet.getBalance());
    }

    @Given("I have deposited $0 in my wallet")
    public void i_have_deposited_$0_in_my_wallet() {
        wallet.deposit(0);
        assertEquals(0, wallet.getBalance(),"Incorrect wallet balance");
    }

    @When("I request $15")
    public void i_request_negative_$15() {
        cashier.withdraw(wallet, 15);
    }

    @Then("no money should be dispensed when wallet is empty")
    public void no_money_should_be_dispensed_when_wallet_is_empty() {
        assertEquals(0, cashSlot.getContents());
        assertEquals(0, wallet.getBalance());
    }

    @Given("there is $100 in my wallet")
    public void there_is_$100_in_my_wallet() {
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance());
    }

    @When("I withdraw $200")
    public void i_withdraw_$200() {
        cashier.withdraw(wallet, 200);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents());
        assertEquals(100, wallet.getBalance());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_dont_have_enough_money_in_my_wallet() {
        String expected = "You don't have enough money in your wallet";
        assertEquals(expected, cashier.getMessage());
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        wallet.getBalance();
    }

    @Then("I should see that the balance is $100")
    public void i_should_see_that_balance_is_$100() {
        assertEquals(100, wallet.getBalance());
    }
}
