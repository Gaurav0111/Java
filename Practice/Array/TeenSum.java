package Array;

import java.util.*;

public class TeenSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        if (nums.length < 3)
            return list;
        else if (nums.length == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                List<Integer> list1 = new ArrayList<>();
                list1.add(nums[0]);
                list1.add(nums[1]);
                list1.add(nums[2]);
                list.add(list1);
            }
            return list;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i != j && j != k && k != i) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> list1 = new ArrayList<>();
                            list1.add(nums[i]);
                            list1.add(nums[j]);
                            list1.add(nums[k]);
                            list.add(list1);
                            i++;
                            j++;
                            k++;
                        }
                    }
                }
            }
        }
        // Arrays.sort(nums);
        // int x = 0;
        // int y = 1;
        // int z = nums.length - 1;
        // while (y < z) {
        // if (nums[x] + nums[y] + nums[z] == 0) {
        // List<Integer> list1 = new ArrayList<>();
        // list1.add(nums[x]);
        // list1.add(nums[y]);
        // list1.add(nums[z]);
        // list.add(list1);
        // }
        // if (nums[x] + nums[y] + nums[z] > 0) {
        // z--;
        // } else if (nums[x] + nums[y] + nums[z] < 0) {
        // y++;
        // }
        // }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        // int arr[] = { 0, 0, 0 };
        // int arr[] = { 0, 1, 1 };
        System.out.println(threeSum(arr));
    }
}
