package Practice.Algo;

public class BinarySearch {

    public static boolean helper(int[] nums, int left, int right, int target) {
        if (left > right) {  
            return false;
        }

        int mid = (left + right) / 2;
        if (nums[mid] == target)
            return true;
        else if (target < nums[mid]) {
            return helper(nums, left, mid - 1, target);
        } else {
            return helper(nums, mid + 1, right, target);
        }
    }

    public static boolean search(int[] nums, int target) {
        return helper(nums, 0, nums.length - 1, target); 
    }

    public static void main(String[] args) {
        int array[] = { 0, 0, 1, 2, 2, 5, 6 };
        System.out.println(search(array, 0));  // Should print true
    }
}
