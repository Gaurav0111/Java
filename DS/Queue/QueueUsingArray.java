package DS.Queue;

class QueueArray {
    int data[];
    int front;
    int rear;
    int size;

    QueueArray(int length) {
        data = new int[length];
        front = -1;
        rear = -1;
        size = 0;
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int getFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return data[front];
    }

    void enqueue(int val) {
        if (size == data.length) {
            throw new RuntimeException("Queue is full");
        } else if (size == 0) {
            front = 0;
        }
        rear++;
        size++;
        if (rear == data.length) {
            rear = 0;
        }
        data[rear] = val;
    }

    int dequeue() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");

        int temp = data[front];
        front++;
        if (front == data.length) {
            front = 0;
        }
        size--;
        if (size == 0)
            front = rear = -1;
        return temp;
    }

    void print() {
        System.out.print("[ ");
        while (!isEmpty()) {
            System.out.print(dequeue()+" ");
        }
        System.out.print("]");
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(10);
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);
        System.out.println(queue.getFront());
        System.out.println(queue.getSize());
        System.out.println(queue.dequeue());
        queue.print();

    }
}
