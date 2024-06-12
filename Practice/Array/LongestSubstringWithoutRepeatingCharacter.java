package Array;

import java.util.*;

class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        // HashMap<Character, Boolean> map = new HashMap<>();
        // int size = 0;
        // int left = 0;
        // for (int right = 0; right < s.length(); right++) {
        // char ch = s.charAt(right);
        // if (map.get(ch) == null) {
        // map.put(ch, true);
        // size++;
        // left = Math.max(left, size);
        // } else {
        // size = 0;
        // map.clear();
        // }
        // }
        // return left;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (map.containsKey(currentChar) && map.get(currentChar) >= start) {
                start = map.get(currentChar) + 1;
            }
            map.put(currentChar, end);
            int currentLength = end - start + 1;
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        Solution2 sl = new Solution2();
        System.out.println(sl.lengthOfLongestSubstring("aab"));
    }
}