package DS.Queue;

class ListNode<T> {
    T data;
    ListNode<T> next;

    ListNode(T data) {
        this.data = data;
    }
}

class QueueList {
    ListNode front;
    ListNode rear;

    void enqueue(int val) {
        ListNode node = new ListNode<>(val);
        if (front == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = rear.next;
        }
        // System.out.println(rear.data);
    }

    void dequeue() {
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }
        front = front.next;
        if (front == null)
            rear = null;
    }

    void print() {
        ListNode temp = front;
        System.out.print("[");
        while (temp != null) {
            System.out.print(" " + temp.data);
            if (temp.next != null)
                System.out.print(',');
            temp = temp.next;
        }
        System.out.println("]");
    }

}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        QueueList queue = new QueueList();
        queue.enqueue(45);
        queue.enqueue(25);
        queue.enqueue(35);
        queue.enqueue(55);
        queue.enqueue(65);
        queue.enqueue(75);
        queue.enqueue(25);
        // System.err.println(queue.dequeue());
        // System.err.println(queue.dequeue());
        queue.print();
    }
}
