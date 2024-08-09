package String;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int i = 0;
        // System.out.println(map);
        // for (int i = 0; i < s.length() + 1; i++){
        while (i < s.length() - 1) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            if (map.get(first) < map.get(second)) {
                result += map.get(second) - map.get(first);
                i += 2;
            } else {
                result += map.get(first);
                i++;
            }
            if (i == s.length()-1)
                result += map.get(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        // String s = "III";
        String s = "LVIII";
        // String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
