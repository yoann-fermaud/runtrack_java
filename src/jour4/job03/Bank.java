package jour4.job03;

public class Bank {
    private int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    public void getBalance() {
        System.out.println("New balance: " + this.balance);
    }

    public synchronized void withdraw(int sum) {
        if (this.balance >= 0 && sum > this.balance) {
            System.out.println("Incorrect amount!");
        } else {
            this.balance -= sum;
            this.getBalance();
        }
    }
}
