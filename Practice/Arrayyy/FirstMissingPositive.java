// package Practice.Arrayyy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 1; i <= nums.length; i++)
            map.put(i, true);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], false);
        }
        for (Map.Entry<Integer, Boolean> mapElement : map.entrySet()) {
            boolean value = mapElement.getValue();
            if (mapElement.getValue()) {
                return mapElement.getKey();
            }
        }
        Arrays.sort(nums);
        return nums[nums.length - 1] + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0 };
        System.out.println(firstMissingPositive(arr));
    }
}
