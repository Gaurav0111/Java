package DS.LinkedList;

public class ReverseNodesInKGroup {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = head;
        for()
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        ListNode node = new ListNode(arr[0]);
        ListNode head = node;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            node.next = temp;
            node = node.next;
        }
        ListNode result = reverseKGroup(head, 2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
