import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    public static void helper(TreeNode root, List<Integer> list) {
        if (root != null) {
            helper(root.left, list);
            helper(root.right, list);
            list.add(root.val);
        }
    }

    public static void main(String[] args) {

    }
}
