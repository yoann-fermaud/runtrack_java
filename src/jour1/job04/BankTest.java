package jour1.job04;

public class BankTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.getBalance();
        bankAccount.deposit(50);
        bankAccount.withdraw(70);
        bankAccount.withdraw(90);
    }
}
