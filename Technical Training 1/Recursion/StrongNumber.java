package Recursion;

public class StrongNumber {

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
    
    public static int sumOfFactorials(int n) {
        if (n == 0) {
            return 0;
        } else {
            return factorial(n % 10) + sumOfFactorials(n / 10);
        }
    }
    
    public static boolean isStrongNumber(int n) {
        return n == sumOfFactorials(n);
    }
    public static void main(String[] args) {
        int number = 145;
    
        if (isStrongNumber(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }
}
