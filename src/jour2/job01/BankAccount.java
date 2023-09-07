package jour2.job01;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void getBalance() {
        System.out.println("Current balance: " + this.balance + "€");
    }

    public void deposit(int sum) {
        this.balance += sum;
        System.out.println(sum + "€ deposited. New balance: " + this.balance + "€");

    }

    public void withdraw(int sum) {
        if (this.balance >= sum) {
            this.balance -= sum;
            System.out.println(sum + "€ withdrawn. New balance: " + this.balance + "€");
        } else {
            System.out.println("Attempted withdrawal of " + sum + "€... Insufficient balance!");
        }
    }
}
