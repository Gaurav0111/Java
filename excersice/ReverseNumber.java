package excersice;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1534236469, result = 0;
        int nn = 1534236469;
        // int reverse = 9646324351;
        while (num != 0) {
            int n = num % 10;
            result = (result * 10) + n;
            num /= 10;
            // System.out.println();
        }
        System.err.println(result);
    }
}
