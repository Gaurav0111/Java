import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            // Submitting tasks using lambda expression
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Task executed by thread: " + threadName);
            });
        }

        // Shutdown the thread pool
        executor.shutdown();
    }
}
