package Advance_java_code;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<Object> queue = new LinkedList<>();

        // Enqueue (add) elements to the queue
        queue.add("Element 1");
        queue.add(45);
        queue.add(45.00);
        queue.offer("Element 2");
        queue.add("Element 3");

        System.out.println( " Original Queue: "+queue);
        // Dequeue (remove) elements from the queue
        System.out.println("Removed element: " + queue.poll());

        // Peek at the front element without removing it
        System.out.println("Front element: " + queue.peek());
    }
}

