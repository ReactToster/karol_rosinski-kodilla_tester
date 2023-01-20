package wallet;

import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;

public class WalletWithdrawalProtectionSteps implements En {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);

    public WalletWithdrawalProtectionSteps() {
        Given("there is ${int} in my wallet", (Integer amount) -> {
            wallet.deposit(amount);
        });
        When("I withdraw ${int}", (Integer amount) -> {
            cashier.withdraw(wallet, amount);
        });
        Then("nothing should be dispensed", () -> {
            Assertions.assertEquals(0, cashSlot.getContents());
        });
        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assertions.assertEquals("Incorrect amount!", cashier.getErrorMessage());
        });
    }
}
