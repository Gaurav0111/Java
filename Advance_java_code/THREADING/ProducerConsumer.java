import java.util.LinkedList;
import java.util.Queue;

class Data {
    Queue<String> q;
    int capacity;

    public Data(int cap) {
        q = new LinkedList<>();
        capacity = cap;
    }

    public void publish(String msg) {
        synchronized (this) {
            if (q.size() == capacity) {
                try {
                    System.out.println("Queue Full! Waiting for message to be consumed...");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            q.add(msg);
            System.out.println("Message published: " + msg);
            System.out.println("Queue: " + q);
            notify(); // Notify consumer that message is available
        }
    }

    public void consume() {
        synchronized (this) {
            if (q.size() == 0) {
                try {
                    System.out.println("Waiting for new message...");
                    wait(); // Wait until message is published
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String msg = q.poll();
            System.out.println("Consumed message: " + msg);
            System.out.println("Queue: " + q);
            notify(); // Notify producer that space is available
        }
    }
}

class Producer implements Runnable {
    Data data;

    public Producer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        final String[] messages = { "Hi!!", "How are you!!", "hashashash", "hohohoho", "hahahaha", "hehehe" };
        int i = 0;
        try {
            while (true) {
                Thread.sleep(1000);
                data.publish(messages[i]);
                i = (i + 1) % messages.length;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(2000);
                data.consume();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Data data = new Data(5);
        Thread producer = new Thread(new Producer(data), "Producer");
        Thread consumer = new Thread(new Consumer(data), "Consumer");

        producer.start();
        consumer.start();
    }
}
