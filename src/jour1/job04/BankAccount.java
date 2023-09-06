package jour1.job04;

public class BankAccount {
    private int balance = 100;

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
