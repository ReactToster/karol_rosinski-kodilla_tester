package wallet;

import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;

public class WalletSteps implements En {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assertions.assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
        });

        When("I request ${int}", (Integer amount) -> {
            cashier.withdraw(wallet, amount);
        });

        Then("${int} should be dispensed", (Integer amount) -> {
            Assertions.assertEquals(amount, cashSlot.getContents());
        });

        Then("there should be error message {string}", (String string) -> {
            Assertions.assertEquals(string, cashier.getErrorMessage());
        });

        Then("the balance of my wallet should be ${int}", (Integer int1) -> {
            Assertions.assertEquals(170, wallet.getBalance(), "Incorrect wallet balance");
        });
    }
}
