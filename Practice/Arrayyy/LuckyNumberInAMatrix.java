package Practice.Arrayyy;

import java.util.*;

public class LuckyNumberInAMatrix {

    public static List<Integer> luckyNumbers(int[][] matrix) {
        Set<Integer> minList = new HashSet<>();
        Set<Integer> maxList = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min)
                    min = matrix[i][j];
            }
            minList.add(min);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > max)
                max = matrix[j][i];
            }
            maxList.add(max);
        }
        // for(int j=0;j<matrix)
        // for (int j = 0; j < matrix.length; j++) {
        // if (matrix[j][i] > max)
        // max = matrix[j][i];
        // }

        // maxList.add(max);
        // }
        System.out.println(minList);
        System.out.println(maxList);
        minList.retainAll(maxList);
        return new ArrayList<>(minList);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 10, 4, 2 },
                { 9, 3, 8, 7 },
                { 15, 16, 17, 12 } };
        // int matrix[][] = { { 3, 7, 8 },
        // { 9, 11, 13 },
        // { 15, 16, 17 } };
        System.out.println(luckyNumbers(matrix));

    }
}
