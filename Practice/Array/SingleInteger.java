package Array;

import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int num : nums) {
        // if (map.get(num) == null) {
        // map.put(num, 1);
        // } else {
        // map.put(num, map.get(num) + 1);
        // }
        // }
        // for (Map.Entry<Integer, Integer> set : map.entrySet()) {
        // if (set.getValue() == 1) {
        // return set.getKey();
        // }
        // }
        // return 0;
        // }
        int x = 0;
        for (int num : nums) {
            x = x^num;
            
        }
        return x;
        
    }
}

public class SingleInteger {

}
