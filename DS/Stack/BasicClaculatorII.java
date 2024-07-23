package DS.Stack;

import java.util.*;

public class BasicClaculatorII {

    public static int helper(int first, String operand, int second) {
        System.out.println(first);
        System.out.println(operand);
        System.out.println(second);
        if (operand.equals("+"))
            return first + second;
        if (operand.equals("-"))
            return first - second;
        if (operand.equals("*"))
            return first * second;
        if (operand.equals("/"))
            return first / second;
        return 0;
    }

    public static int calculate(String s) {
        s = s.replaceAll(" ", "");
        String str[] = s.split("[+ -- * /]");
        if (str.length < 2)
            return Integer.parseInt(s);
        Stack<Character> operators = new Stack<>();
        Stack<Integer> operands = new Stack<>();
        for (String st : str) {
            operands.push(Integer.parseInt(st));
        }
        for (int i = 0; i < s.length(); i++) {
            try {
                Integer.parseInt("" + s.charAt(i));
            } catch (Exception e) {
                operators.push(s.charAt(i));
            }
        }
        // System.out.println(operands);
        // System.out.println(operators);
        // System.out.println(stack);
        int result = operands.pop();
        while (!operands.isEmpty()) {
            switch ("" + operators.pop()) {
                case "+":
                    result = operands.pop() + result;
                    break;
                case "-":
                    result = operands.pop() - result;
                    break;
                case "*":
                    result = operands.pop() * result;
                    break;
                case "/":
                    result = operands.pop() / result;
                    break;
                default:
                    break;
            }
            // result = helper(operands.pop(), "" + operators.pop(), result);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "3+2*2";
        // String s = " 3+5 / 2 " ;
        // String s = "0-2147483647";
        // String s = " 13/2 ";
        // String s = "1337";
        System.out.println(calculate(s));
    }
}
