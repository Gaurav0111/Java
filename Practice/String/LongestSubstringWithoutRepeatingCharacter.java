package String;

import java.util.*;

class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int start = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hashMap.get(ch) != null && hashMap.get(ch) >= start) {
                start = hashMap.get(ch) + 1;
            }
            hashMap.put(ch, i);
            int length = i - start + 1;
            result = Math.max(result, length);
        }
        return result;
    }
}

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        Solution2 sl = new Solution2();
        System.out.println(sl.lengthOfLongestSubstring("aab"));
    }
}