package DS.Stack;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

class StackList<T> {
    Node<T> top;
    int size = 0;

    void push(T data) {
        Node<T> newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
        // if (top == null)
        // top = newNode;
        // else {
        // Node<T> temp = top;
        // while (temp.next != null)
        // temp = temp.next;
        // temp.next = newNode;
        // }
    }

    void peek() {
        if (top == null)
            throw new RuntimeException("Stack is empty");
        System.out.println(top.data);
    }

    T pop() {
        if (top == null)
            throw new RuntimeException("Stack is empty");
        T ele = top.data;
        top = top.next;
        size--;
        return ele;
    }
}

public class StackWithLinkedList {
    public static void main(String[] args) {
        StackList<Integer> stack = new StackList();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.peek();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
