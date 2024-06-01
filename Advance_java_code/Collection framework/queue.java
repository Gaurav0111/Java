// package Advance_java_code;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Object> queue = new LinkedList<>();
        
        queue.add("Element 1");
        queue.add(45);
        queue.add(45.00);
        queue.offer("Element 2");
        queue.add("Element 3");
        
        System.out.println( " Original Queue: "+queue);
        
        System.out.println("Removed element: " + queue.poll());
        
        System.out.println("Front element: " + queue.peek());
        
        System.out.println( "Updated Queue: "+queue);
        
        Queue<Object> queue1 = new PriorityQueue<>();
        queue1.add(782);
        queue1.add(781);
        queue1.add(785);
        queue1.add(784);
        queue1.add(783);
        System.out.println( "Priority Queue: "+queue1);


    }   
}

