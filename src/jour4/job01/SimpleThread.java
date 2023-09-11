package jour4.job01;

public class SimpleThread extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from thread!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
