package TwoDArray;

import java.util.ArrayList;

public class MatrixSnakePattern {
    public static void main(String[] args) {
        int matrix[][] = { { 45, 48, 54 },
                { 21, 89, 87 },
                    { 70, 78, 15 } };
            ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    // System.out.print(matrix[i][j]+" ");
                    list.add(matrix[i][j]);
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    list.add(matrix[i][j]);
                    // System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
}
