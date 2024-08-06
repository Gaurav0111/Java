public class EvaluateBooleanBinaryTree {

    static int and(TreeNode left, TreeNode right) {
        if (left.val == right.val)
            return 1;
        else
            return 0;
    }

    static int or(TreeNode left, TreeNode right) {
        if (left.val == 1 || right.val == 1)
            return 1;
        else
            return 0;
    }

    public boolean evaluateTree(TreeNode root) {
        if (root == null || root.val == 0)
            return false;
        
    }

    public static void main(String[] args) {

    }
}
