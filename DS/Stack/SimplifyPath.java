package DS.Stack;

import java.util.*;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for (String s : path.split("[/]")) {
            if (s.equals("") || s.equals(".")) {
                continue;
            } else if (s.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                stack.push(s);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        StringBuilder output = new StringBuilder();
        while(!stack.isEmpty()) {
            output.insert(0,stack.pop());
            output.insert(0, "/");
        }
        return output.toString();
        // System.out.println(output);
        // for (int i = 0; i < stack.size(); i++) {
        // System.out.println(stack.get(i));
        // if (stack.get(i).equals("..")) {
        // stack.remove(i - 1);
        // stack.remove(i);
        // } else if (stack.get(i).equals(".")) {
        // stack.remove(i);
        // }
        // }
        // System.out.println(stack);
        // System.out.println(stack.pop());
        // for (int i = 0; i < stack.size(); i++) {
        // path += "/";
        // if (stack.get(i).equals("") || stack.get(i).equals(".")) {
        // continue;
        // }
        // else if {

        // }
        // }
    }

    public static void main(String[] args) {
        String path = "/home/";
        // String path = "/home/user//Documents/../Pictures/.";
        System.out.println(simplifyPath(path));
    }
}
