import java.util.concurrent.*;

public class CreatingThreadPool {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        int numberOfThreads = 5;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        ThreadPoolExecutor executor_1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(numberOfThreads);
        // Submit tasks for execution
        for (int i = 0; i < 10; i++) {
            // Example task: printing a message
            Runnable task = new Task("Task " + i);
            executor.submit(task);
            executor_1.submit(task);
        }
        
        // Shut down the executor service
        executor.shutdown();
    }
}

// Example task class
class Task implements Runnable {
    private String message;
    
    public Task(String message) {
        this.message = message;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " executing: " + message);
        // Simulate some task execution
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
