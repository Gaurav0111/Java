package DS.Stack;

import java.util.Stack;

public class PalindromeLinnkedList {

    public static boolean isPalindrome(ListNode head) {
        boolean result = true;
        if (head.next == null)
            return result;
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        while (head != null) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2};
        // int arr[] = { 11, 12, 13, 14 };
        ListNode node = new ListNode(arr[0]);
        ListNode head = node;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            node.next = temp;
            node = node.next;
        }
        System.out.println(isPalindrome(head));
    }

}
