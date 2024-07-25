package DS.Stack;

import java.util.*;

// Same as Basic Calculator I
public class Solution {
    public static int calculate(String s) {
        int cur = 0;
        char operator = '+';
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                cur = cur * 10 + (ch - '0');
            }
             System.out.println(stack);
            if (!Character.isDigit(ch) && ch != ' ' || i == s.length() - 1) {
                if (operator == '+') {
                    stack.push(cur);
                } else if (operator == '-') {
                    stack.push(-cur);
                } else if (operator == '*') {
                    stack.push(stack.pop() * cur);
                } else if (operator == '/') {
                    stack.push(stack.pop() / cur);
                }
                operator = ch;
                cur = 0;
            }
        }
        // System.out.println(stack);
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }

        return res;
    }
    public static void main(String[] args) {
        // System.out.println(calculate("1787+2136/3/2*2"));
        System.out.println(calculate("1-1+1"));
    }
}