package homework;

import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;

public class WhatWordIsItSteps implements En {
    private int number;
    private boolean isDivisible;

    private String answer = "";

    public WhatWordIsItSteps() {
        Given("number is {int}", (Integer number) -> {
            this.number = number;
        });
        When("it's divisible by {int}", (Integer integer) -> {
            this.isDivisible = number % integer == 0;
            if (this.isDivisible && integer == 3) {
                this.answer = "Fizz";
            } else if (this.isDivisible && integer == 5) {
                this.answer = "Buzz";
            }
        });

        When("it's divisible by {int} and {int}", (Integer int1, Integer int2) -> {
            this.isDivisible = (number % int1 == 0 && number % int2 == 0);
            if (this.isDivisible)
                this.answer = "FizzBuzz";
        });

        When("it's not divisible by {int} or {int} or both them", (Integer int1, Integer int2) -> {
            this.isDivisible = (number % int1 == 0 && number % int2 == 0) || number % int1 == 0 || number % int2 == 0;
            if (!this.isDivisible)
                this.answer = "None";
        });

        Then("answer is {string}", (String string) -> {
            Assertions.assertEquals(string, this.answer);
        });
    }
}
