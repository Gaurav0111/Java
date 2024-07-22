package DS.Stack;

import java.util.Stack;

public class BaseBallGame {

    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int top = -1;
        for (int i = 0; i < operations.length; i++) {
            try {
                int num = Integer.parseInt(operations[i]);
                stack.push(num);
                top++;
            } catch (Exception e) {
                if (operations[i] == "C") {
                    stack.pop();
                    top--;
                } else if (operations[i] == "D") {
                    stack.push(stack.peek() * 2);
                    top++;
                } else if (operations[i] == "+") {
                    stack.push(stack.peek() + stack.get(top - 1));
                    top++;
                }
            }
            System.out.println(stack);
        }
        int result = 0;
        for (int i = 0; i <= top; i++) {
            result += stack.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        // String arr[] = {"5","2","C","D","+"};
        // String arr[] = {"5","-2","4","C","D","9","+","+"};
        String arr[] = {"5","2","C","D","+"};
        System.out.println(calPoints(arr));
    }
}
