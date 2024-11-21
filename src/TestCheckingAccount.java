public class TestCheckingAccount {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(100.00);  // Start with a $100 balance

        // Perform some deposits and withdrawals
        account.deposit(50.00);  // 1st transaction, free
        account.deposit(20.00);  // 2nd transaction, free
        account.withdraw(30.00); // 3rd transaction, free
        account.deposit(10.00);  // 4th transaction, fee applies

        // Check the final balance and transaction count
        System.out.println("Final balance: $" + account.getBalance());
        System.out.println("Total transactions this month: " + account.getTransactionCount());
    }
}
