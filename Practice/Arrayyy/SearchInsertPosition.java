package Practice.Arrayyy;

public class SearchInsertPosition {
    static int helper(int[] nums, int target, int left, int right) {
        int mid = (left + right) / 2;
        if (nums[mid] == target)
            return mid;
        if (nums[mid] > target)
            helper(nums, target, left, mid - 1);
        if (nums[mid] < target)
            helper(nums, target, mid + 1, right);
        return -1;
    }

    public static int searchInsert(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    public static void main(String[] args) {

    }
}
