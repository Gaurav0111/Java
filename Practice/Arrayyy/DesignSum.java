package Practice.Arrayyy;

class neighborSum {
    int arr[][];

    public neighborSum(int[][] grid) {
        arr = new int[grid.length][grid.length];
        arr = grid;
    }
    int temp = Integer.MIN_VALUE;
    public int adjacentSum(int value) {
        int i = 0, j = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (arr[i][j] == value)
                    break;
            }
            if (arr[i][j] == value)
                break;
        }
        int result = 0;
        if (i != 0)
            result += arr[i - 1][j];
        if (i != arr.length)
            result += arr[i + 1][j];
        if (j != 0)
            result += arr[i][j - 1];
        if (j != arr.length)
            result += arr[i][j + 1];
        return result;
    }

    public int diagonalSum(int value) {
        return 0;
    }
}

public class DesignSum {
    public static void main(String[] args) {
        int grid[][] = { { 0, 1, 2 },
                { 3, 4, 5 },
                { 6, 7, 8 } };
        neighborSum obj = new neighborSum(grid);
        System.out.println(obj.adjacentSum(1));
    }
}
