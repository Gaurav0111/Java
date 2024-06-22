package TwoDArray;

public class SearchInTwoDMatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 70;
        boolean result = false;
        for (int i = 0; i < matrix.length; i++) {
            if (target > matrix[i][matrix[i].length - 1]) {
                continue;
            } else {
                for (int val : matrix[i]) {
                    if (val == target)
                        result = true;
                }
            }

        }
    }
}
