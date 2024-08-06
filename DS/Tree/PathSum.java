
public class PathSum {
    static boolean helper(TreeNode root, int sum, int targetSum) {
        if (root == null)
            return false;
        sum += root.val;
        if (root.left == null && root.right == null)
            return sum == targetSum;
        boolean leftResult = helper(root.left, sum, targetSum);
        boolean rightResult = helper(root.right, sum, targetSum);
        return leftResult || rightResult;
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, 0, targetSum);
    }

    public static void main(String[] args) {

    }
}
