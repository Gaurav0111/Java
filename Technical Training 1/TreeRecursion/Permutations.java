package TreeRecursion;

import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        helper(nums, smallList, finalList);
        return finalList;
    }

    void helper(int[] nums, List<Integer> smallList, List<List<Integer>> finalList) {
        if (nums.length == smallList.size()) {
            finalList.add(new ArrayList<Integer>(smallList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!smallList.contains(nums[i])) {
                smallList.add(nums[i]);
                helper(nums, smallList, finalList);
                smallList.remove(smallList.size() - 1);
            }
        }
    }
}