public class NonSynchronizedExample {

    private int counter = 0;

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        NonSynchronizedExample example = new NonSynchronizedExample();

        // Create multiple threads to increment the counter
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    example.increment();
                }
            });
            thread.start();
        }

        // Wait for all threads to finish
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter (non-synchronized): " + example.getCounter());
    }
}
