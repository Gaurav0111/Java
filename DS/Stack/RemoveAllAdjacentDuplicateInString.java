package DS.Stack;

import java.util.*;

public class RemoveAllAdjacentDuplicateInString {
    static String helper(String s) {
        Stack stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        s = "";
        int num = stack.size();
        for (int i = 0; i < num; i++) {
            var ch = stack.pop();
            if (s.isEmpty()) {
                s = ch + s;
            } else if (ch.equals(s.charAt(0))) {
                s = s.substring(1);
            } else {
                s = ch + s;
            }
        }
        return s;
    }

    public static String removeDuplicates(String s) {
        Stack stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        s = "";
        int num = stack.size();
        for (int i = 0; i < num; i++) {
            var ch = stack.pop();
            if (s.isEmpty()) {
                s = ch + s;
            } else if (ch.equals(s.charAt(0))) {
                s = s.substring(1);
            } else {
                s = ch + s;
            }
        }
        return s;
        // if (s.length() == 1) {
        //     return s;
        // }
        // char ch = s.charAt(0);
        // String result = removeDuplicates(s.substring(1));
        // if (result.charAt(0) == ch)
        //     result = result.substring(1);
        // else
        //     result = ch + result;
        // return result;
        // return helper(s);
        // String result = "";

        // int n = s.length();
        // for (int j = 0; j < n / 2; j++) {
        // for (int i = 0; i < n - 1; i++) {
        // if (s.charAt(i) == s.charAt(i + 1)) {
        // result += s.substring(0, i);
        // result += s.substring(i + 2, s.length());
        // }
        // }
        // s = result;
        // }
        // return result;
    }

    public static void main(String[] args) {
        System.out.println(helper("aaaaaaab"));
        // System.out.println(removeDuplicates("azxxzy"));
        // System.out.println(removeDuplicates("aaaaaaaa"));
        // System.out.println(removeDuplicates("aaaaaaaa"));
    }
}
