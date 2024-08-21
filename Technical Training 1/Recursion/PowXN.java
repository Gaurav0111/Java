package Recursion;

public class PowXN {

    public static double helperNegetive(double x, double num, int n) {
        try {
            if (n == 0) {
                return (double) 1 / num;
            }
            num = num * x;
            double result = helperNegetive(x, num, n + 1);
            return result;
        } catch (Exception e) {
            return 0;
        }
    }

    public static double helperPositive(double x, double num, int n) {
        try {
            if (n == 0)
                return 1;
            double result = helperPositive(x, 0, n - 1);
            return (double) result * x;
        } catch (StackOverflowError e) {
            if(x<=1){
                return x;
            }
            else{
                return 0;
            }
        }
    }

    public static double myPow(double x, int n) {
        if (n == 0)
            return 1;
        if (n > 0)
            return helperPositive(x, 1, n);
        else
            return helperNegetive(x, 1, n);
    }

    public static void main(String[] args) {
        // System.out.println(myPow(2.00000, 10));
        // System.out.println(myPow(2.00000, -2));
        // System.out.println(myPow(2.10000, 3));
        // System.out.println(myPow(0.00001, 2147483647));
        System.out.println(myPow(-1.00000, 2147483647));
    }
}
