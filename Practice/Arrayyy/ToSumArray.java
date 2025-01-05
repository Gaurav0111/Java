// package Practice.Arrayyy;

import java.util.*;

public class ToSumArray {

    static int[] helper(int[] nums, int target) {
        int cpy;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            cpy = target;
            list.clear();

            for (int j = i; j < nums.length; j++) {
                if (nums[j] <= cpy) {
                    cpy -= nums[j];
                    list.add(nums[j]);
                }
                if (cpy == 0) {
                    break;
                }
            }
            if (cpy == 0) {
                break;
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    // static int[] helper(int[] nums, int target) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         int complement = target - nums[i];
    //         if (map.containsKey(complement)) {
    //             return new int[]{complement, nums[i]};
    //         }
    //         map.put(nums[i], i);
    //     }
    //     return new int[]{}; 
    // }

    public static void main(String[] args) {
        System.out.println("hey");
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = helper(nums, target);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
