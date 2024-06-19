public class TestProgram {
    public static void main(String[] args) {
        BasicAccount account = new BasicAccount(500);

        System.out.println("Initial Balance: " + account.getBalance());

        account.withdraw(100);
        System.out.println("Balance after withdrawing $100: " + account.getBalance());

        account.withdraw(450);
        System.out.println("Balance after trying to withdraw $450: " + account.getBalance());

        account.withdraw(50);
        System.out.println("Balance after withdrawing $50: " + account.getBalance());
    }
}
