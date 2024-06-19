public class TestProgram {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(500);

        System.out.println("Initial Balance: " + account.getBalance());

        account.withdraw(600);
        System.out.println("Balance after first overdraft: " + account.getBalance());

        account.withdraw(50);
        System.out.println("Balance after second overdraft: " + account.getBalance());

        account.deposit(700);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(1300);
        System.out.println("Balance after third overdraft: " + account.getBalance());
    }
}
