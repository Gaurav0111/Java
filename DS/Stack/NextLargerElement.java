package DS.Stack;

import java.util.*;
public class NextLargerElement {
    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        // for (int i = 0; i < n - 1; i++) {
        // long max = arr[i];
        // for (int j = i + 1; j < n; j++) {
        // if (arr[j] > max) {
        // arr[i] = arr[j];
        // break;
        // } else if (j == n - 1) {
        // arr[i] = -1;
        // }
        // }
        // }
        Stack<Long> stack = new Stack<>();
        for (long val : arr)
            stack.push(val);
        System.out.println(stack);
        long max = Long.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (stack.peek() > max) {
                max = stack.peek();
            }
            if (stack.peek() == max) {
                arr[i] = -1;
            } else
                arr[i] = max;
            stack.pop();
        }
        arr[n - 1] = -1;
        return arr;
    }

    public static void main(String[] args) {
        long[] arr = { 1, 3, 2, 4 };
        // long[] arr = { 7, 8, 1, 4 };
        int n = 4;
        long[] res = nextLargerElement(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(res[i] + " ");
    }
}
