package DS.Stack;

public class ValidParantheses {
    public static boolean isValid(String s) {
        int small = 0;
        int curly = 0;
        int big = 0;
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                small++;
            else if (s.charAt(i) == ')')
                small--;
            else if (s.charAt(i) == '{')
                curly++;
            else if (s.charAt(i) == '}')
                curly--;
            else if (s.charAt(i) == '[')
                big++;
            else if (s.charAt(i) == ']')
                big--;
            int n = s.length() / 2;
            if (small < 0 || small > n || curly < 0 || curly > n || big < 0 || big > n) {
                return false;
            }
        }
        if (small == 0 && curly == 0 && big == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "([)]";
        // String s = "{[{[{[{[{[({})]}]}]}]}]}";
        System.out.println(isValid(s));
    }
}
