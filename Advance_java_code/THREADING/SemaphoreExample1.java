import java.util.concurrent.Semaphore;

class Shared {
    static int count = 0;
}

class FirstCode2 extends Thread {
    Semaphore s;
    String threadName;

    public FirstCode2(Semaphore s, String threadName) {
        super(threadName);
        this.s = s;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        if (this.getName().equals("A")) {
            System.out.println("Starting " + threadName);
            try {
                System.out.println(threadName + " is waiting for a permit.");
                s.acquire();
                System.out.println(threadName + " gets a permit.");
                for (int i = 0; i < 5; i++) {
                    Shared.count++;
                    System.out.println(threadName + ": " + Shared.count);
                    Thread.sleep(10);
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            System.out.println(threadName + " releases the permit.");
            s.release();
        } else {
            System.out.println("Starting " + threadName);
            try {
                System.out.println(threadName + " is waiting for a permit.");
                s.acquire();
                System.out.println(threadName + " gets a permit.");
                for (int i = 0; i < 5; i++) {
                    Shared.count--;
                    System.out.println(threadName + ": " + Shared.count);
                    Thread.sleep(10);
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            System.out.println(threadName + " releases the permit.");
            s.release();
        }
    }
}

public class SemaphoreExample1 {
    public static void main(String args[]) throws InterruptedException {
        Semaphore s = new Semaphore(1);
        FirstCode2 fc = new FirstCode2(s, "A");
        FirstCode2 fc2 = new FirstCode2(s, "B");
        fc.start();
        fc2.start();
        fc.join();
        fc2.join();
        System.out.println("count: " + Shared.count);
    }
}
