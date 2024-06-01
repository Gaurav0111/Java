import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static final int NUM_THREADS = 5;
    private static final int NUM_PERMITS = 2; // Number of permits available

    private static Semaphore semaphore = new Semaphore(NUM_PERMITS);

    public static void main(String[] args) {
        for (int i = 0; i < NUM_THREADS; i++) {
            Thread thread = new Thread(new Worker(i));
            thread.start();
        }
    }

    static class Worker implements Runnable {
        private int id;
 
        public Worker(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire(); // Acquire a permit
                System.out.println("Thread " + id + " is accessing the shared resource.");
                Thread.sleep(2000); // Simulate some work
                System.out.println("Thread " + id + " has finished accessing the shared resource.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release(); // Release the permit
            }
        }
    }
}
