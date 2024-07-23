package DS.Queue;

import java.util.*;

public class DemoQueue {

    public static void main(String[] args) {
        Queue<Integer> linkedListQueue = new LinkedList<>();
        Queue<Integer> arrayDequeueQueue = new ArrayDeque<>();
        arrayDequeueQueue.offer(100);
        arrayDequeueQueue.offer(200);
        arrayDequeueQueue.offer(300);
        arrayDequeueQueue.add(500);
        System.out.println(arrayDequeueQueue);
        System.out.println(arrayDequeueQueue.peek());
        System.out.println(arrayDequeueQueue.poll());
        arrayDequeueQueue.offer(400);
        System.out.println(arrayDequeueQueue);
    }
}