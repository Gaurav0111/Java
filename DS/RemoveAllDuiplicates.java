package DS;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class RemoveAllDuiplicates {
    Node head;
    Node tail;

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            RemoveAllDuiplicates llist = new RemoveAllDuiplicates();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            Solution ob = new Solution();
            head = ob.removeAllDuplicates(llist.head);
            llist.printList(head);

            t--;
        }
    }
}
// } Driver Code Ends

class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
        if (head == null || head.next == null)
            return head;

        Node pre = null;
        Node current = head;
        while (current != null) {
            Node nt = current.next;
            //     current.next = nt.next;
            // }
            if(nt.data==current.data){
                while(nt.next!=null && nt.data!=current.data   ){
                    nt = nt.next;
                }
            }
            current.next = nt;
            pre = current;
            current = current.next;
        }

        return head;
    }
}