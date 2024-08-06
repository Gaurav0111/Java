import java.util.*;

public class PathSumll {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        helper(root, new ArrayList<>(), result, targetSum);
        return result;
    }

    static void helper(TreeNode root, List<Integer> currentResult, List<List<Integer>> result, int sum) {
        if (root == null)
            return;
        currentResult.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            result.add(new ArrayList<>(currentResult));
        } else {
            helper(root.left, currentResult, result, sum - root.val);
            helper(root.right, currentResult, result, sum - root.val);
        }
        currentResult.remove(currentResult.size() - 1);
    }

}
