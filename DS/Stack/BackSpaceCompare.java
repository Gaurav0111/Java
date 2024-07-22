package DS.Stack;

import java.util.Stack;

public class BackSpaceCompare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack_1 = new Stack<>();
        Stack<Character> stack_2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#')
                stack_1.push(s.charAt(i));
            else {
                if (!stack_1.isEmpty())
                    stack_1.pop();
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#')
                stack_2.push(t.charAt(i));
            else {
                if (!stack_1.isEmpty())
                    stack_1.pop();
            }
        }
        return stack_1.equals(stack_2);

    }

    public static void main(String[] args) {
        // String s = "ab#c", t = "ad#c";
        String s = "xywrrmp", t = "xywrrmu#p";
        System.out.println(backspaceCompare(s, t));
    }
}
