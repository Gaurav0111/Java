class Solution {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 0) {
            return 0;
        }
        int left = 0, product = 0, count = 0;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (product >= k) {
                product = product / nums[left];
                left++;
            }
            count = count + right - left + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        numSubarrayProductLessThanK(null, 0);
    }
}