package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElement {

    static public int[] topK(int[] nums, int k) {
        // Code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int result[] = new int[k];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println("Original: "+map);
        ArrayList<Map.Entry<Integer,Integer>> list  = new ArrayList<>(map.entrySet());
        Collections.sort(list,(first,second)->first.getValue().equals(second.getValue())?second.getKey().compareTo(first.getKey()):second.getValue().compareTo(first.getValue()));
        System.out.println(list);
        return result;
    }

    public static void main(String[] args) {
        int k = 2;
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        System.out.println(topK(nums, k));
    }
}
