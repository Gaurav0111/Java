package Array;

public class DivideTwointeger {
    public static int divide(int dividend, int divisor) {
        int result = dividend / divisor;
        if (dividend < 0 && divisor < 0)
            result = Math.abs(result);
        if (result > 2147483647)
            return 2147483647;
        if (result < -2147483648)
            return -2147483648;
        return result;
    }

    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = -1;
        System.out.println(divide(dividend, divisor));
    }
}
