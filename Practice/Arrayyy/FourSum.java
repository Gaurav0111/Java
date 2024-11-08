package Practice.Arrayyy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new LinkedHashSet<>();
        // System.out.println(target);
        // System.out.println(target==(long)(nums[0] +(long) nums[1] +(long) nums[2] + (long)nums[3]));
        // System.out.println((long)(nums[0] +(long) nums[1] +(long) nums[2] + (long)nums[3]));
        // // int num = 1000000000;
        // if (nums.length == 4) {
        // if (nums[0] + nums[1] + nums[2] + nums[3] == target) {
        // List<Integer> list1 = new ArrayList<>();
        // list1.add(nums[0]);
        // list1.add(nums[1]);
        // list1.add(nums[2]);
        // list1.add(nums[3]);
        // set.add(list1);
        // List<List<Integer>> list = new ArrayList<>(set);
        // return list;
        // }
        // }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int ii = i + 1; ii < nums.length; ii++) {
                int j = ii + 1;
                int k = nums.length - 1;
                while (j < k) {
                    long result = (long) nums[i] + (long) nums[ii] + (long) nums[j] + (long) nums[k];
                    // System.out.println(result);
                    if (result == target) {
                        if (i != j && j != k && k != ii && ii != i) {
                            List<Integer> list1 = new ArrayList<>();
                            list1.add(nums[i]);
                            list1.add(nums[ii]);
                            list1.add(nums[j]);
                            list1.add(nums[k]);
                            list1.sort(null);
                            set.add(list1);
                        }
                        j++;
                        k--;
                    }
                    if (result < target)
                        j++;
                    if (result > target)
                        k--;
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }

    public static void main(String[] args) {
        // int arr[] = {1,0,-1,0,-2,2};
        int arr[] = { 1000000000, 1000000000, 1000000000, 1000000000 };
        // int arr[] = { 2, 2, 2, 2, 2 };
        System.out.println(fourSum(arr, -294967296));
    }
}
