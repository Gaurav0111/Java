package Practice.Arrayyy;

import java.util.*;

class Solution6 {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return s.indexOf(entry.getKey());
            }
        }
        return -1;
    }
}

public class FirstNonRepeatingCharcter {
    public static void main(String[] args) {
        Solution6 sl = new Solution6();
        System.out.println(sl.firstUniqChar("leetcode"));
    }
}
