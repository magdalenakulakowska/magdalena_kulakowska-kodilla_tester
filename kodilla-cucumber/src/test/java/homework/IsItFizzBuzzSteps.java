package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static homework.FizzBuzzChecker.checkFizzBuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsItFizzBuzzSteps {
    private int number;
    private String answer;

    @Given("the number is 2")
    public void the_number_is_2() {
        this.number = 2;
    }

    @Given("the number is 3")
    public void the_number_is_3() {
        this.number = 3;
    }

    @Given("the number is 5")
    public void the_number_is_5() {
        this.number = 5;
    }

    @Given("the number is 15")
    public void the_number_is_15() {
        this.number = 15;
    }

    @Given("the number is 8")
    public void the_number_is_8() {
        this.number = 8;
    }

    @Given("the number is 30")
    public void the_number_is_30() {
        this.number = 30;
    }

    @Given("the number is 20")
    public void the_number_is_20() {
        this.number = 20;
    }

    @Given("the number is 9")
    public void the_number_is_9() {
        this.number = 9;
    }

    @Given("the number is 60")
    public void the_number_is_60() {
        this.number = 60;
    }

    @When("I ask wheter number is dividable by 3, 5, both or none")
    public void i_ask_wheter_number_is_dividable_by_3_5_both_or_none() {
        this.answer = checkFizzBuzz(this.number);
    }

    @Then("Result should be {string}")
    public void result_should_be(String string) {
        assertEquals(string, this.answer);
    }
}
