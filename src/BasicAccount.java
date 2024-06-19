public class BasicAccount extends BankAccount {

    public BasicAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds balance. Transaction canceled.");
        }
    }
}
