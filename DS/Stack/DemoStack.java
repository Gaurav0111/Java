package DS.Stack;

import java.util.*;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
