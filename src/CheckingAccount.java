public class CheckingAccount {
    private double balance;
    private int transactionCount;  // Tracks the number of transactions in the month
    private final double FEE = 1.00;  // Transaction fee for exceeding the free limit

    // Constructor
    public CheckingAccount(double initialBalance) {
        balance = initialBalance;
        transactionCount = 0;  // Initially, no transactions have been made
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        transactionCount++;  // Increment transaction count
        applyTransactionFee();
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionCount++;  // Increment transaction count
            applyTransactionFee();
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Method to apply a fee for transactions exceeding 3 per month
    private void applyTransactionFee() {
        if (transactionCount > 3) {
            balance -= FEE;  // Deduct the fee from the balance
            System.out.println("Transaction fee of $" + FEE + " applied. Current balance: $" + balance);
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to get the transaction count (for testing purposes)
    public int getTransactionCount() {
        return transactionCount;
    }
}
