package DS;

import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null; // bydefault it will be null
    }
}

class LinkedListOperation<T> {
    Node<T> head;
    Node<T> tail;

    void update(T search, T repalce) {

    }

    void search(T ele) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data == ele) {
                System.out.println("Element Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
    }

    void deleteAtBegain() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node<T> temp = head;
            head = head.next;
            temp.next = temp = null;
        }
    }

    void deleteAtEnd() {
        if (head == null)
            System.out.println("List is empty");
        if (head.next == null) {
            head = null;
        } else {
            Node<T> temp = head;
            Node<T> temp2 = null;
            while (temp != null) {
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null;
            temp = null;
        }
    }

    void deletePos(int pos) {
        Node<T> temp = null;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (pos == 0) {
            temp = head;
            head = head.next;
            temp = null;
            return;
        }
        temp = head;
        int i = 1;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    void insertAtBegain(Node<T> node) {
        if (head == null) {
            tail = head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    void insetAtMid(Node<T> node, int pos) {
        if (head == null) {
            head = node;
            return;
        }
        if (pos == 0) {
            node.next = head;
            head = node;
            return;
        }
        if (pos > 0) {
            Node<T> temp = head;
            int i = 1;
            while (i < pos) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    void insertAtEnd(Node<T> node) {
        // if (head == null) {
        // head = node;
        // } else {
        // Node<T> temp = head;
        // while (temp.next != null) {
        // temp = temp.next;
        // }
        // temp.next = node;
        // }
        if (head == null) {
            tail = head = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListDemo {
    static Node<Integer> creaNode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the data of node: ");
        int data = scanner.nextInt();
        Node<Integer> node = new Node(data);
        return node;
    }

    public static void main(String[] args) {
        // Node<Integer> node = new Node<>(10);
        // Node<Integer> node2 = new Node<>(20);
        // node.next = node2;
        LinkedListOperation<Integer> op = new LinkedListOperation();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 insert at end");
            System.out.println("2 printing");
            System.out.println("3.Insert At begain");
            System.out.println("4. Insert at mid");
            System.out.println("5. Insert at End");
            System.out.println("6.Delete At begain");
            System.out.println("7. Delete at mid");
            System.out.println("8. Delete at End");
            System.out.println("9. Update");
            System.out.println("0 Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    op.insertAtEnd(creaNode());
                    break;
                case 2:
                    op.print();
                    break;
                case 3:
                    op.insertAtBegain(creaNode());
                    break;
                case 4:
                    op.insetAtMid(creaNode(), 3);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("invalid");
                    break;
            }
        }
    }
}
