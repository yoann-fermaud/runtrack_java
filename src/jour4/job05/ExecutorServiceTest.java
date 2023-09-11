package jour4.job05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        int arg = Integer.parseInt(args[0]);
        int[] factors = {1, 2, 3};
        for (int factor : factors) {
            Runnable runnableTask = () -> {
                int result = factor * arg;
                System.out.println("Result of the task " + factor + ": " + result);
            };
            executorService.submit(runnableTask);
        }
        executorService.shutdown();
    }
}
