package DS.Stack;

import java.util.Stack;

public class MakeTheStringGreat {

    public static String makeGood(String s) {
        if (s.length() < 2) {
            return s;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        s = "";
        int num = stack.size();
        // System.out.println('E' + 32 == 'e');
        // System.out.println(('E' + 32));
        // System.out.println("e"+32=="e"+32);
        for (int i = 0; i < num; i++) {
            char ch = stack.pop();
            if (s.isEmpty()) {
                s = ch + s;
            } else if (Math.abs(ch-s.charAt(0))==32) {
                // System.out.println(ch-32);
                // System.out.println(Character.toUpperCase(s.charAt(0)));
                // System.out.println();
                s = s.substring(1);
            } else {
                s = ch + s;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "abBAcC";
        // String s = "leEeetcode";
        System.out.println(makeGood(s));
    }
}
