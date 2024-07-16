package Array;

import java.util.*;

public class TeenSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        // Set<List<Integer>> set = new LinkedHashSet<>();
        // if (nums.length < 3) {
        // List<List<Integer>> list = new ArrayList<>();
        // return list;
        // }
        // for (int i = 0; i < nums.length - 2; i++) {
        // for (int j = i + 1; j < nums.length - 1; j++) {
        // for (int k = j + 1; k < nums.length; k++) {
        // if (i != j && j != k && k != i) {
        // if (nums[i] + nums[j] + nums[k] == 0) {
        // List<Integer> list1 = new ArrayList<>();
        // list1.add(nums[i]);
        // list1.add(nums[j]);
        // list1.add(nums[k]);
        // list1.sort(null);
        // set.add(list1);
        // }
        // }
        // }
        // }
        // }
        Set<List<Integer>> set = new LinkedHashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    if (i != j && j != k && k != i) {
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        list1.sort(null);
                        set.add(list1);
                    }
                    j++;
                    k--;
                }
                if (nums[i] + nums[j] + nums[k] < 0)
                    j++;
                if (nums[i] + nums[j] + nums[k] > 0)
                    k--;
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        // int arr[] = { 0, 0, 0 };
        // int arr[] = { 0, 1, 1 };
        System.out.println(threeSum(arr));
    }
}
