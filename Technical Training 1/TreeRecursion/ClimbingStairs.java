package TreeRecursion;

public class ClimbingStairs {

    static int climbStairs(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        int count_1 = climbStairs(n - 1);
        int count_2 = climbStairs(n - 2);
        return count_1 + count_2;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
