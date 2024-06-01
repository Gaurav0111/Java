import java.util.concurrent.Semaphore;

public class SemaphoreExample2 {
    private Semaphore semaphore = new Semaphore(5); // Semaphore with 5 permits

    public void accessResource() {
        try {
            semaphore.acquire(); // Acquire a permit
            // Access the shared resource
            System.out.println("Thread " + Thread.currentThread().getId() + " is accessing the resource.");
            Thread.sleep(1000); // Simulating resource access
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            semaphore.release(); // Release the permit
            System.out.println("Thread " + Thread.currentThread().getId() + " released the permit.");
        }
    }

    public static void main(String[] args) {
        SemaphoreExample2 example = new SemaphoreExample2();
        // Simulate multiple threads accessing the resource
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> example.accessResource());
            thread.start();
        }
    }
}
