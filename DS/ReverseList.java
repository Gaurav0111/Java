package DS;
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

public class ReverseList {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null)
            return head;
        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode nt = current.next;
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
