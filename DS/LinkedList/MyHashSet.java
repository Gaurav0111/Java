package DS.LinkedList;

// class Node {
//     int val;
//     Node next;

//     public Node(int val, Node next) {
//         this.val = val;
//         this.next = next;
//     }
// }

class MyHashSet {
    Node head;

    public MyHashSet() {
        head = null;
    }

    public void add(int key) {
        if (contains(key))
            return;
        Node node = new Node(key, head);
        head = node;
    }

    public void remove(int key) {
        if (head == null)
            return;
        if (head.val == key && head.next == null) {
            head = null;
            return;
        }
        if (head.val == key) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.val == key) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public boolean contains(int key) {
        Node current = head;
        while (current != null) {
            if (current.val == key)
                return true;
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(45);
        obj.add(4);
        obj.add(8);
        obj.add(9);
        obj.remove(8);
        System.out.println(obj.contains(4));
    }
}