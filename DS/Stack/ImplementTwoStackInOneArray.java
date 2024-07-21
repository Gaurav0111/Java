package DS.Stack;

class TwoStack {
    int arr[];
    int capacity;
    int top1;
    int top2;

    TwoStack(int capacity) {
        this.capacity = capacity;
        arr = new int[this.capacity];
        top1 = -1;
        top2 = capacity;
    }

    void push1(int ele) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = ele;
        } else {
            System.out.println("Stack Full");
        }
    }

    void push2(int ele) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = ele;
        } else {
            System.out.println("Stack if full");
        }
    }

    int pop1() {
        if (top1 >= 0) {
            int ele = arr[top1];
            top1--;
            return ele;
        } else {
            throw new RuntimeException("Stack1 Is empty");
        }
    }

    int pop2() {
        if (top2 <= capacity) {
            int ele = arr[top2];
            top2++;
            return ele;
        } else {
            throw new RuntimeException("Stack2 Is empty");
        }
    }

    void peek1() {
        for (int i = top1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    void peek2() {
        for (int i = top2; i < capacity; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class ImplementTwoStackInOneArray {
    public static void main(String[] args) {
        TwoStack stack = new TwoStack(10);
        stack.push1(101);
        stack.push1(201);
        stack.push1(301);
        stack.push2(11);
        stack.push2(21);
        stack.push2(31);
        stack.peek1();
        System.out.println("*****************************************************");
        stack.peek2();
        stack.pop1();
        stack.pop2();
        System.out.println();
        stack.peek1();
        System.out.println("*****************************************************");
        stack.peek2();
    }
}
