package String;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public static int length(int num) {
        int length = 0;
        while (num > 0) {
            length += 1;
            num = num / 10;
        }
        return length - 1;
    }

    public static String intToRoman(int num) {
        String result = "";
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        // System.out.println(map);
        int cpy = num;
        while (cpy > 0) {
            int size = length(cpy);
            int first = cpy / (int) Math.pow(10, size);
            if (first != 4 && first != 9) {
                if (cpy - 1000 >= 0) {
                    result += "M";
                    cpy -= 1000;
                }
                if (cpy - 500 >= 0) {
                    result += "D";
                    cpy -= 500;
                }
                if (cpy - 100 >= 0) {
                    result += "C";
                    cpy -= 100;
                }
                if (cpy - 50 >= 0) {
                    result += "L";
                    cpy -= 50;
                }
                if (cpy - 10 >= 0) {
                    result += "X";
                    cpy -= 10;
                }
                if (cpy - 5 >= 0) {
                    result += "V";
                    cpy -= 5;
                }
                if (cpy - 1 >= 0) {
                    result += "I";
                    cpy -= 1;
                }
            }
            cpy = cpy % (int) Math.pow(10, size);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }
}
