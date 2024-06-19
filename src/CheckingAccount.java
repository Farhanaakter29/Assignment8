import java.time.LocalDate;
public class CheckingAccount extends BankAccount {
    private static final double FIRST_OVERDRAFT_PENALTY = 20.0;
    private static final double SUBSEQUENT_OVERDRAFT_PENALTY = 30.0;
    private int overdraftsThisMonth;
    private LocalDate lastOverdraftDate;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
        this.overdraftsThisMonth = 0;
        this.lastOverdraftDate = LocalDate.now();
    }

    @Override
    public void withdraw(double amount) {
        LocalDate today = LocalDate.now();
        if (today.getMonthValue() != lastOverdraftDate.getMonthValue()) {
            overdraftsThisMonth = 0; // Reset overdraft count at the beginning of a new month
        }

        if (amount > getBalance()) {
            if (overdraftsThisMonth == 0) {
                super.withdraw(amount + FIRST_OVERDRAFT_PENALTY);
                System.out.println("Overdraft! A penalty of $20 has been charged.");
            } else {
                super.withdraw(amount + SUBSEQUENT_OVERDRAFT_PENALTY);
                System.out.println("Overdraft! A penalty of $30 has been charged.");
            }
            overdraftsThisMonth++;
            lastOverdraftDate = today;
        } else {
            super.withdraw(amount);
        }
    }
}

