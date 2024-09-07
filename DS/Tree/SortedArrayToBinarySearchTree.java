import java.util.Arrays;

public class SortedArrayToBinarySearchTree {
    public static void sortedArrayToBST(int[] nums) {
        TreeNode head = new TreeNode();
        Arrays.sort(nums);
        head.val = nums[nums.length / 2];
        // System.out.println(head.val);
        TreeNode node = head;
        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] < node.val) {
                if (node.left == null) {
                    node.left = TreeNode(nums[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { -10, -3, 0, 5, 9 };
        sortedArrayToBST(nums);
    }
}
