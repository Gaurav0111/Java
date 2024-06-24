package TwoDArray;
import java.util.*;
public class TransposeMatrix {

    public int[][] transpose(int[][] matrix) {
        int result[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
