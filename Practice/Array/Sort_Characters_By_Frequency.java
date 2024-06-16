package Array;

import java.util.*;

class Solution7 {
    public String frequencySort(String s) {
        String str = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String ch = s.charAt(i) + "";
            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        TreeMap<Character, Integer> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            while (entry.getValue() != 0) {
                str += entry.getKey();
                map.put(entry.getKey(), map.get(entry.getKey()) - 1);
            }
        }
        s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // extracts each character
            s = ch + s; // adds each character in front of the existing string
        }
        return s;
    }
}

public class Sort_Characters_By_Frequency {
    public static void main(String[] args) {
        Solution7 sl = new Solution7();
        System.out.println(sl.frequencySort("eeeedrraaa"));
    }
}
