package Array;

import java.util.*;

public class LongestSubarrayWithKDistinctCharacter {
    public static void main(String[] args) {
        String s = "aaabbcc";
        int k = 2;
        // Output: 3 (The substring is "ece")
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch,i);
            while (map.size()>=k ) {
                map.remove(s.charAt(start));
                start++;
            } 
            int currentLength = i-start+1;
            result = Math.max(result, currentLength);
        }
        System.out.println(result);
    }
}
