import java.util.*;

public class TopViewOfBinaryTree {
    static ArrayList<Integer> topView(Node root) {
        List<Integer> list = new ArrayList<>();
        Node node1 = root;
        Node node2 = root;
        helperLeft(node1, list);
        helperRight(node2.right, list);
        return new ArrayList<>(list);
    }

    static void helperLeft(Node root, List<Integer> list) {
        if (root != null) {
            helperLeft(root.left, list);
            list.add(root.data);
        }
    }

    static void helperRight(Node root, List<Integer> list) {
        if (root != null) {
            helperLeft(root.right, list);
            list.add(root.data);
        }
    }

    public static void main(String[] args) {

    }
}
