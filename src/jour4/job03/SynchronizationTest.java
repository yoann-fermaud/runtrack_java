package jour4.job03;

public class SynchronizationTest {
    public static void main(String[] args) {
        int arg0 = Integer.parseInt(args[0]);
        int arg1 = Integer.parseInt(args[1]);

        Bank bank = new Bank(arg0);
        Thread thread0 = new Thread(() -> {
            bank.withdraw(arg1);
            System.out.println("Thread-1 withdrew " + arg1 + ".");
        });

        Thread thread1 = new Thread(() -> {
            bank.withdraw(arg1);
            System.out.println("Thread-2 withdrew " + arg1 + ".");
        });

        thread0.start();
        thread1.start();
    }
}
