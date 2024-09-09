public class CountCompleteTreeNode {
    public int countNodes(TreeNode root) {
        return helper(root, 0);
    }

    public static int helper(TreeNode root, int count) {
        if (root != null) {
            helper(root.left, count);
            helper(root.right, count);
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
