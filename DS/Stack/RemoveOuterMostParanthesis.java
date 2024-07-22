package DS.Stack;

public class RemoveOuterMostParanthesis {

    public static String removeOuterParentheses(String s) {
        String result = "";
        int i = 0;
        while (i < s.length() - 1) {
            if (s.charAt(i) == '(') {
                i++;
                int temp = i;
                int open = 0;
                while (open != 0 || s.charAt(i) != ')') {
                    if (s.charAt(i) == '(')
                        open++;
                    if (s.charAt(i) == ')')
                        open--;
                    i++;
                }
                result += s.substring(temp, i);
                // System.out.println(result);
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        // System.out.println("Result: " + removeOuterParentheses("(()())(())"));
        // System.out.println(removeOuterParentheses("()()"));
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
    }
}
