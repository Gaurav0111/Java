package DS.LinkedList;

public class RemoveLinkedListElement {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        while (head.val == val && head.next != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = null;
        }
        if (head.val == val) {
            if (head.next == null) {
                head = null;
                return head;
            } else
                head = head.next;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        System.out.println();
        return head;

    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 6, 3, 4, 5, 6};
        int arr[] = { 7, 7, 7, 7 };
        // int arr[] = { 7, 7, 7, 7, 3, 7, 7, 5, 656, 67, 7, 6, 7, 67, 6, 7, 6, 76, 7,
        // 6, 7, 67, 6, 7, 6, 76, 7};
        ListNode node = new ListNode(arr[0]);
        ListNode head = node;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            node.next = temp;
            node = node.next;
        }
        ListNode result = removeElements(head, 7);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
