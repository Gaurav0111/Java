package DS.LinkedList;

import java.util.*;

public class MergeKSortedList {
    public static ListNode node = null;
    public static void sortList() {
        ListNode current = node;
        while (current != null) {
            ListNode index = current.next;
            ListNode min = current;
            while (index != null) {
                if (index.val < min.val) {
                    min = index;
                }
                index = index.next;
            }
            int temp = current.val;
            current.val = min.val;
            min.val = temp;
           current = current.next;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;
        ListNode result=new ListNode(0);
        node = result;
        for (int i = 0; i < lists.length; i++) {
            head = lists[i];
            while(head!=null){
                result.next = head;
                result = result.next;
                head = head.next;
            }
        }
        node = node.next;
        sortList();
        return node;
    }

    public static void main(String[] args) {

    }
}
