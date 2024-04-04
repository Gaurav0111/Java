package TreeRecursion;

public class BoardDiceGameProblem {

    static void numberOfPossibility(int num, int result, String str) {
        if (num == result) {
            System.out.println(str);
            return;
        }
        if (num > result) {
            return;
        }
        numberOfPossibility(num + 1, result, str + "1");
        numberOfPossibility(num + 2, result, str + "2");
        numberOfPossibility(num + 3, result, str + "3");
        numberOfPossibility(num + 4, result, str + "4");
        numberOfPossibility(num + 5, result, str + "5");
        numberOfPossibility(num + 6, result, str + "6");

    }

    public static void main(String[] args) {
        numberOfPossibility(0, 5, "");
    }
}
