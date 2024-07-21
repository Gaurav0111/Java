package DS.LinkedList;

import java.util.*;

// class ListNode {
//     int val;
//     ListNode next;

//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }

public class LinkedListCycle {
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            if (list.contains(head.val)) {
                return true;
            } else {
                list.add(head.val);
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 0, -4 };
        Node node = new Node(arr[0]);
        Node head = node;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            node.next = temp;
            node = node.next;
        }
        // Node temp = new Node(head.next.val);
        node.next = head.next;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        // System.out.println(hasCycle(head));
    }
}
