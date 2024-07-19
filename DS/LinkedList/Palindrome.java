package DS.LinkedList;

import java.util.Stack;

public class Palindrome {

    public boolean isPalindrome(Node head) {
        if (head == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Stack<Integer> stack = new Stack<>();
        while (slow != null) {
            stack.push(slow.val);
            slow = slow.next;
        }

        Node current = head;
        while (!stack.isEmpty()) {
            if (current.val != stack.pop()) {
                return false;
            }
            current = current.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(2);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Palindrome palindromeChecker = new Palindrome();
        System.out.println(palindromeChecker.isPalindrome(n1)); // Should print true
    }
}
