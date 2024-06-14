package Array;

class Solution4 {
    // public void rotate(int[] nums, int k) {
    // while (k > 0) {
    // int i = nums.length - 1;
    // int val = nums[nums.length - 1];
    // for (; i >= 0; i--) {
    // nums[i] = nums[i - 1];
    // }
    // nums[0] = val;
    // k--;
    // }
    // }
    public void rotate(int[] nums, int k) {
        int i;
        int val = 0;
        if (nums.length <= 1) {
            return;
        }
        int arr[] = new int[k];
        i = nums.length - 1;
        k--;
        while (k >= 0) {
            arr[k] = nums[i];
            k--;
            i--;
        }
        if (nums.length % 2 != 0) {
            val = nums[nums.length / 2];
        }
        for (i = 0; i < nums.length - arr.length; i++) {
            nums[i + arr.length] = nums[i];
        }
        for (i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        if (nums.length % 2 != 0) {
            nums[nums.length - 1] = val;
        }
    }
}

public class Rotate_Array {
    public static void main(String[] args) {
        Solution4 sl = new Solution4();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // int arr[] = { 1, 2 };
        sl.rotate(arr, 2);
    }
}
