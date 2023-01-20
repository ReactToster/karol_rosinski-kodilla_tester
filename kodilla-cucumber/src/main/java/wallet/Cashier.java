package wallet;

public class Cashier {
    private final CashSlot cashSlot;
    private String errorMessage;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount && amount > 0) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        } else
            this.errorMessage = "Incorrect amount!";
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
