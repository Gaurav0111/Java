package Practice.Arrayyy;

import java.util.Arrays;

public class MinimumAverageofSmallestandLargestElement {
    public static double minimumAverage(int[] nums) {
        double result = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            double average =(double) (nums[left] + nums[right]) / 2;
            result = result < average ? result : average;
            left++;
            right--;
        }
        return result;
    }

    public static void main(String[] args) {
        // int nums[] = { 1,9,8,3,10,5};
        int nums[] = { 1,2,3,7,8,9};
        // int nums[] = { 7, 8, 3, 4, 15, 13, 4, 1 };
        System.out.println(minimumAverage(nums));
    }
}
