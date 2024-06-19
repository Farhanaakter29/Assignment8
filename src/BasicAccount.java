public class BasicAccount extends BankAccount {
    private static final double OVERDRAFT_PENALTY = 30.0;

    public BasicAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            super.withdraw(amount + OVERDRAFT_PENALTY);
            System.out.println("Overdraft! A penalty of $30 has been charged.");
        } else {
            super.withdraw(amount);
        }
    }
}
