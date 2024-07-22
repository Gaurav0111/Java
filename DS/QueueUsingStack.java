package DS;

import java.util.Stack;

class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {
    }

    public void push(int x) {
        stack1.push(x);
        // System.out.println(stack1);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            int num = stack1.size();
            for (int i = 0; i < num; i++) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            int num = stack1.size();
            for (int i = 0; i < num; i++) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        if (stack1.isEmpty() && stack2.isEmpty())
            return true;
        return false;
    }
}

public class QueueUsingStack {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(45);
        obj.push(25);
        obj.push(35);
        obj.push(15);
        obj.push(55);
        System.out.println(obj.pop());
        obj.push(65);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
        // boolean param_4 = obj.empty();
    }
}
