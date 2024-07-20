package DS.LinkedList;

public class RemoveDuplicateFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || (head.next.next == null && head.next.val == head.val)) {
            head = null;
            return head;
        }
        if (head.next == null) {
            return head;
        }
        // while (head.next != null && head.val == head.next.val) {
        //     head = head.next;
        // }
        while (head != null) {
            ListNode num = head;
            if (head.next.val == num.val) {
                while (head.next != null && head.next.val == num.val)
                    head = head.next;
            }
        }
        System.out.println(head.next.val);
        ListNode pre = null;
        ListNode cur = head;
        while (cur.next != null) {
            ListNode num = cur.next;
            if (cur.val == num.val) {
                while (num.next != null && num.val == cur.val) {
                    num = num.next;
                }
            }
            // System.out.println(cur.val);
            // System.out.println(num.val);
            if (pre != null)
                pre.next = num;
            cur.next = num;
            pre = cur;
            cur = cur.next;
            // return head;
        }
        return head;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 1 };
        int arr[] = { 1, 1, 1, 2, 2, 3, 4, 4, 5 };
        ListNode node = new ListNode(arr[0]);
        ListNode head = node;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            node.next = temp;
            node = node.next;
        }
        // while (head!=null) {
        // System.out.println(head.val);
        // head = head.next;
        // }
        ListNode result = deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
