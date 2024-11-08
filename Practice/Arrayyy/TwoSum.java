package Practice.Arrayyy;

import java.util.*;

class Solution {
    public int[] twoSum(int[] arr, int target) {
        int pair[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            if (map.get(val) != null) {
                pair[0] = map.get(val);
                pair[1] = i;
            }
            map.put(arr[i], i);
        }
        return pair;
    }
}

// class Solution {
// public int[] twoSum(int[] nums, int target) {
// int pair[] = new int[2];
// int cpy[] = Arrays.copyOf(nums, nums.length);
// Arrays.sort(cpy);
// int i = 0, j = nums.length - 1;
// while (i < j) {
// int sum = cpy[i] + cpy[j];
// if (sum == target) {
// break;
// } else if (sum < target) {
// i++;
// } else if (sum > target) {
// j--;
// }
// }
// for (int k = 0; k < nums.length; k++) {
// if (nums[k] == cpy[i]) {
// pair[0] = k;
// }
// }
// for (int k = nums.length - 1; k >= 0; k--) {
// if (nums[k] == cpy[j]) {
// pair[1] = k;
// }
// }
// return pair;
// }
// }

public class TwoSum {

}
