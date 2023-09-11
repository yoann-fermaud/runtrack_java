package jour4.job07;

public class ThreadInterruptionTest {
    public static void main(String[] args) {
        int threadSleepTime = Integer.parseInt(args[0]);

        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread sleeping for " + threadSleepTime + " seconds!");
                Thread.sleep(threadSleepTime * 1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupt after " + threadSleepTime / 2 + " seconds!");
            }
        });

        thread.start();

        try {
            Thread.sleep(threadSleepTime * 1000 / 2);
            thread.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End of process!");
    }
}
