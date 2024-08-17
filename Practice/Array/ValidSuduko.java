package Array;

import java.util.HashMap;

public class ValidSuduko {
    public static boolean isValidSudoku(String[][] nums) {
        boolean result = true;
        HashMap<String, Boolean> map = new HashMap<>();
        // for (int row = 0; row < nums.length; row++) {
        // for (int temp = 1; temp <= 9; temp++)
        // map.put("" + temp, true);
        // for (int column = 0; column < 9; column++) {
        // if (map.get(nums[row][column]))
        // map.put(nums[row][column], false);
        // else {
        // return false;
        // }
        // }
        // for (int temp = 1; temp <= 9; temp++)
        // map.put("" + temp, true);
        // for (int column = 0; column < 9; column++) {
        // if (map.get(nums[column][row]))
        // map.put(nums[column][row], false);
        // else {
        // return false;
        // }
        // }
        // }
        for (int row = 0; row < nums.length; row++) {
            for (int column = 0; column < 9; column++) {
                if (nums[row][column] == ".")
                    continue;
                if (map.get(nums[row][column]) == null)
                    map.put(nums[row][column], true);
                else {
                    // System.out.println("hey");
                    return false;
                }
            }
            map.clear();
            for (int column = 0; column < 9; column++) {
                if (nums[column][row] == ".")
                    continue;
                if (map.get(nums[column][row]) == null)
                    map.put(nums[column][row], true);
                else {
                    // System.out.println("hey");
                    return false;
                }
            }
            map.clear();
            for (int i = row; i < row + 3; i++) {
                for (int j = row; j < row + 3; j++) {
                    if (nums[i][j] == ".")
                        continue;
                    if (map.get(nums[i][j]) == null)
                        map.put(nums[i][j], true);
                    else {
                        System.out.println("hey");
                        return false;
                    }
                }
            }
            map.clear();
        }
        return result;
    }

    public static void main(String[] args) {
        String nums[][] = { { "5", "3", ".", ".", "7", ".", ".", ".", "." },
                { "6", ".", ".", "1", "9", "5", ".", ".", "." },
                { ".", "9", "8", ".", ".", ".", ".", "6", "." },
                { "8", ".", ".", ".", "6", ".", ".", ".", "3" },
                { "4", ".", ".", "8", ".", "3", ".", ".", "1" },
                { "7", ".", ".", ".", "2", ".", ".", ".", "6" },
                { ".", "6", ".", ".", ".", ".", "2", "8", "." },
                { ".", ".", ".", "4", "1", "9", ".", ".", "5" },
                { ".", ".", ".", ".", "8", ".", ".", "7", "9" } };
        System.out.println(isValidSudoku(nums));
    }
}

// [".",".",".",".","5",".",".","1","."],
// [".","4",".","3",".",".",".",".","."],
// [".",".",".",".",".","3",".",".","1"],
// ["8",".",".",".",".",".",".","2","."],
// [".",".","2",".","7",".",".",".","."],
// [".","1","5",".",".",".",".",".","."],
// [".",".",".",".",".","2",".",".","."],
// [".","2",".","9",".",".",".",".","."],
// [".",".","4",".",".",".",".",".","."],