package Array;

public class WordSearch {
    public static boolean exist(String[][] board, String word) {

    }

    public static void main(String[] args) {
        String[][] board = { { "A", "B", "C", "E" }, { "S", "F", "C", "S" }, { "A", "D", "E", "E" } };
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
}