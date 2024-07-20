package DS.Stack;

import java.util.*;

class StackArray<T> {
    // T arr[];
    ArrayList<T> arr;
    int capacity;
    int top;

    StackArray(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        arr = new ArrayList<>(capacity);
    }

    void push(T ele) {
        if (getSize() == top) {
            throw new RuntimeException("Stack is full");
        }
        top++;
        arr.add(top, ele);
    }

    void peek() {
        System.out.println(arr.get(top));
        // for (int i = top; i >= 0; i--) {
        // System.out.println(arr.get(i));
        // }
    }

    T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T ele = arr.remove(top); 
        top--;
        return ele; 
    }

    boolean isEmpty() {
        return top == -1;
    }

    int getSize() {
        return top + 1;
    }
}

public class StackWithArray {
    public static void main(String[] args) {
        StackArray<Integer> stack = new StackArray(5);
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.peek();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
