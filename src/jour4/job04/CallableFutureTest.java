package jour4.job04;

import java.util.concurrent.*;

public class CallableFutureTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Callable<Integer> callableTask = () -> {
            int arg0 = Integer.parseInt(args[0]);
            int arg1 = Integer.parseInt(args[1]);
            return arg0 * arg1;
        };

        Future<Integer> futureTask = executorService.submit(callableTask);

        try {
            int result = futureTask.get();
            System.out.println("Multiplication result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
    }
}
