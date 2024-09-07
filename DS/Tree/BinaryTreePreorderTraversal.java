import java.util.*;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    public static void helper(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            helper(root.left, list);
            helper(root.right, list);
        }
    }

    public static void main(String[] args) {

    }
}
