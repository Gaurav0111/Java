package TwoDArray;

import java.util.ArrayList;

public class TransposeMatrix {

    public int[][] transpose(int[][] matrix) {
        int result[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    static long maximumSumSubarray(int k, ArrayList<Integer> arr, int n) {
        int result = 0;
        int num = 0;
        int first = 0;
        int size = 0;
        arr.
        if (n < k)
            return -1;
        for (int end = 0; end < n; end++) {
            num += arr.get(end);
            size++;
            while (size > k) {
                num -= arr.get(first);
                first++;
                size--;
            }
            result = Math.max(result, num);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4, k = 2;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(400);
        list.add(200);
        list.add(300);
        list.add(100);
        System.out.println(maximumSumSubarray(k, list, n));
    }
}
