package Practice.Arrayyy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Set<List<Integer>> set = new LinkedHashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == target) {
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
                if (nums[i] + nums[j] + nums[k] < target)
                    j++;
                if (nums[i] + nums[j] + nums[k] > target)
                    k--;
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        return list.size();
    }

    public static void main(String[] args) {
        int nums[] = { -1, 2, 1, -4 };
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
