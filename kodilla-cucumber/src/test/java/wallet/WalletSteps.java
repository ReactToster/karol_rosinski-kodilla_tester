package wallet;

import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;

public class WalletSteps implements En {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assertions.assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
        });
        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assertions.assertEquals(30, cashSlot.getContents());
        });
    }
}
