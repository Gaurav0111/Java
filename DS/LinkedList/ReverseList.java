package DS.LinkedList;
// class ListNode {

//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//      }

public class ReverseList {
    public Node reverseBetween(Node head, int left, int right) {
        if (head == null || head.next == null)
            return head;
        Node pre = null;
        Node current = head;
        while (current != null) {
            Node nt = current.next;
            current.next = pre;
            pre = current;
            current = nt;
            nt = nt.next;
            current.next = pre;
        }
        return pre;
    }

    public static void main(String[] args) {

    }
}
