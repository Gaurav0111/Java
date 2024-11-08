package Practice.Arrayyy;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int result[][] = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int k = 0;
            for (int j = matrix.length - 1; j >= 0; j--) {
                // matrix[i][j] = result[j][i + j];
                result[i][k % matrix.length] = matrix[j][i];
                k++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                // System.out.print(result[i][j] + " ");
                matrix[i][j] = result[i][j];
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(matrix);
    }
}
