package TreeRecursion;

public class RopeCutProblem {

    static int ropeCut(int ropeLength, int a, int b, int c) {
        if (ropeLength < 0) {
            return -1;
        }
        if (ropeLength == 0) {
            return 0;
        }
        int result1 = ropeCut(ropeLength - a, a, b, c);
        int result2 = ropeCut(ropeLength - b, a, b, c);
        int result3 = ropeCut(ropeLength - c, a, b, c);
        int result = Math.max(Math.max(result1, result2), result3);
        if (result == -1) {
            return -1;
        }
        return result + 1;
    }

    public static void main(String[] args) {
        int ropeLength = 5;
        int a = 2;
        int b = 5;
        int c = 1;
        int maxCut = ropeCut(ropeLength, a, b, c);
        System.out.println(maxCut);
    }
}
