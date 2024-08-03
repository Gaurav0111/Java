import java.util.*;

class BinaryTreeOperation {
    String nodeName = "parent";
    int parentData;
    Scanner scanner = new Scanner(System.in);

    BinaryTreeNode<Integer> add() {
        System.out.print("Enter the node data " + nodeName + " for " + parentData + ": ");
        int data = scanner.nextInt();
        System.out.println();
        if (data == -1) {
            return null;
        }
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(data);
        nodeName = "left";
        parentData = data;
        newNode.left = add();
        nodeName = "right";
        parentData = data;
        newNode.right = add();
        nodeName = "parent";
        return newNode;
    }

    void print(BinaryTreeNode<Integer> root) {
        System.out.print(root.data + " ");
        if (root.left != null)
            print(root.left);
        if (root.right != null)
            print(root.right);
    }
}

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTreeOperation op = new BinaryTreeOperation();
        // System.out.println(op.add());
        BinaryTreeNode<Integer> result = op.add();
        op.print(result);
    }
}