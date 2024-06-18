package TwoDArray;

public class DiagonalSumMatrix {
    public static int diagonalSum(int[][] mat) {
        // int result = 0;
        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat[i].length; j++) {
        //         if (i == j || j + i == mat.length - 1) {
        //             result += mat[i][j];
        //             System.out.println(mat[i][j]);
        //         }
        //     }
        // }
        // return result;
        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            result = result + mat[i][i];
            if (mat.length % 2 != 0 && mat.length / 2 == i) {
                continue;
            }
            result = result + mat[i][mat[i].length - i - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println(diagonalSum(arr));
    }
}
