package DS.LinkedList;

public class SwapNodeInPair {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        if (head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode current = head;
        head = head.next;
        while (current != null && current.next != null) {
            ListNode nextPair = current.next.next;
            // System.out.println(nextPair.val);
            ListNode second = current.next;
            second.next = current;
            current.next = nextPair;
            if (prev != null) {
                prev.next = second;
            }
            prev = current;
            current = nextPair;
        }
        // if (head.next.next == null) {
        // ListNode temp = head;
        // head = head.next;
        // temp.next = null;
        // head.next = temp;
        // return head;
        // }
        // ListNode pre = head;
        // ListNode cur = head.next;
        // head = head.next;
        // while (cur.next != null) {
        // pre.next = cur.next;
        // cur.next = pre;
        // if (pre.next.next == null) {
        // return head;
        // } else {
        // cur = pre.next.next;
        // pre = pre.next;
        // }
        // }
        // if (pre.next.next == null) {
        // pre.next = cur.next;
        // pre = cur;
        // cur = cur.next;
        // pre.next = null;
        // cur.next = pre;
        // }
        // System.out.println(pre.val);
        // System.out.println(cur.val);
        // if (cur.next != null) {
        // pre.next = cur.next;
        // pre = cur;
        // cur = cur.next;
        // pre.next = null;
        // cur.next = pre;
        // }

        // while (cur.next.next != null) {
        // pre = cur;
        // cur = cur.next;
        // pre.next = cur.next;
        // cur.next = pre;
        // cur = pre.next;
        // }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        // int arr[] = { 1, 2, 3, 4, 5 };
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
        ListNode result = swapPairs(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
