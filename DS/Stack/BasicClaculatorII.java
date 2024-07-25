package DS.Stack;

import java.util.*;

public class BasicClaculatorII {

    static Stack<String> stack = new Stack<>();

    public static String helper(int first, String operand, int second) {
        System.out.println(first);
        System.out.println(operand);
        System.out.println(second);
        if (operand.equals("+"))
            return first + second + "";
        if (operand.equals("-"))
            return first - second + "";
        if (operand.equals("*"))
            return first * second + "";
        if (operand.equals("/"))
            return first / second + "";
        return 0 + "";
    }

    public static void calculator(String op) {
        // while (stack.contains(op)) {
        int index = stack.indexOf(op);
        if(index==-1){
            return;
        }
        int first = Integer.parseInt(stack.elementAt(index - 1));
        // System.out.println(first);
        int second = Integer.parseInt(stack.elementAt(index + 1));
        // System.out.println(second);
        String operator = stack.elementAt(index);
        // System.out.println(operator);
        // System.out.println("index:" + index);
        stack.remove(index + 1);
        stack.remove(index);
        stack.add(index, helper(first, operator, second));
        stack.remove(index - 1);
        // }
    }

    public static int calculate(String s) {
        s = s.replaceAll(" ", "");
        if (s.split("[+ -- * /]").length < 2)
            return Integer.parseInt(s);
        String st = "";
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length()) {
                stack.push(st);
                break;
            }
            try {
                int ch = Integer.parseInt(s.charAt(i) + "");
                st += ch;
            } catch (Exception e) {
                stack.push(st);
                st = "";
                stack.push(s.charAt(i) + "");
            }
        }
        System.out.println(stack);
        while (stack.contains("/") || stack.contains("*")) {
            // if (stack.indexOf("/") > stack.indexOf("*")) {
            //     calculator("*");
            //     System.out.println(stack);
            // } else {
            //     calculator("/");
            //     System.out.println(stack);
            // }
            // if(stack.indexOf("*")<stack.indexOf("/")  )
        }
        while (stack.size() > 1) {
            if (stack.indexOf("+") > stack.indexOf("-")) {
                calculator("-");
                calculator("+");
            } else {
                calculator("+");
                calculator("-");
            }

            // while (stack.contains("/")) {
            // int index = stack.indexOf("/");
            // int first = Integer.parseInt(stack.elementAt(index - 1));
            // System.out.println(first);
            // int second = Integer.parseInt(stack.elementAt(index + 1));
            // System.out.println(second);
            // String operator = stack.elementAt(index);
            // System.out.println(operator);
            // System.out.println("index:" + index);
            // stack.remove(index + 1);
            // stack.remove(index);
            // stack.add(index, helper(first, operator, second));
            // stack.remove(index - 1);
            // }
            // while (stack.contains("*")) {
            // int index = stack.indexOf("*");
            // int first = Integer.parseInt(stack.elementAt(index - 1));
            // int second = Integer.parseInt(stack.elementAt(index + 1));
            // String operator = stack.elementAt(index);
            // stack.remove(index + 1);
            // stack.remove(index);
            // stack.add(index, helper(first, operator, second));
            // stack.remove(index - 1);
            // }
            // while (stack.contains("-")) {
            // int index = stack.indexOf("-");
            // int first = Integer.parseInt(stack.elementAt(index - 1));
            // int second = Integer.parseInt(stack.elementAt(index + 1));
            // String operator = stack.elementAt(index);
            // stack.remove(index + 1);
            // stack.remove(index);
            // stack.add(index, helper(first, operator, second));
            // stack.remove(index - 1);
            // }
            // while (stack.contains("+")) {
            // int index = stack.indexOf("+");
            // int first = Integer.parseInt(stack.elementAt(index - 1));
            // int second = Integer.parseInt(stack.elementAt(index + 1));
            // String operator = stack.elementAt(index);
            // stack.remove(index + 1);
            // stack.remove(index);
            // stack.add(index, helper(first, operator, second));
            // stack.remove(index - 1);
            // }
        }
        return Integer.parseInt(stack.pop());
    }

    public static int calculate1(String s) {
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
        System.out.println(operators.search('/'));
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
    public static int calculateCpy(String s) {
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
        // String s = "3+2*2";
        // String s = "1-1+1";
        // String s = " 13+5 / 3 ";
        // String s = "0-2147483647";
        // String s = " 13/2 ";
        // String s = "1337";
        String s = "1787+2136/3/2*2";
        System.out.println(calculate(s));
    }
}
