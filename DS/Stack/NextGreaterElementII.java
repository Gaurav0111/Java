package DS.Stack;

import java.util.*;

public class NextGreaterElementII {
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.empty() && nums[i] > stack.peek()) {
                map.put(stack.pop(), nums[i]);
            }
            stack.push(nums[i]);
        }
        while (!stack.isEmpty()) {
            if (!map.containsKey(stack.peek()))
                map.put(stack.pop(), -1);
            else
                stack.pop();
        }

        // System.out.println(stack);
        // System.out.println(map);
        int result[] = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;
            int j = i + 1;
            while (j != i) {
                j = j % nums.length;
                if (nums[i] < nums[j]) {
                    result[i] = nums[j];
                    flag = true;
                    break;
                }
                j = (j + 1) % nums.length;
            }
            if (!flag)
                result[i] = -1;
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 3 };
        // int nums[] = { 5,4,3,2,1};
        // int nums[] = { 1, 5, 3, 6, 8 };
        int result[] = nextGreaterElements(nums);
        for (int num : result)
            System.out.print(num + " ");
    }
}
