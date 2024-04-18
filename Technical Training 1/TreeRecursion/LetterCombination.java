package TreeRecursion;

import java.util.*;

class LetterCombination {
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        String arr[] = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        if (digits.length() >= 1) {
            int digit = Integer.parseInt(digits);
            helper(digit, list, arr, "", digits.length());
            return list;
        } else {
            return list;
        }
    }

    static void helper(int digit, List<String> list, String arr[], String str, int length) {
        if (digit <= 0) {
            return;
        }
        if (str.length() == length) {
            list.add(str);
            return;
        }
        int firstNum = digit / (int) Math.pow(10, length - 1);
        for (int i = 0; i < (arr[firstNum - 1]).length(); i++) {
            str = str + arr[firstNum - 1].charAt(i);
            helper(digit % (int) Math.pow(10, length - 1), list, arr, str, length - 1);
            // str.remove(smallList.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));

    }
}
