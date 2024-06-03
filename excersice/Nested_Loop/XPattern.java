package excersice.Nested_Loop;

public class XPattern {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n; i++)
                if (i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            System.out.println();
        }
    }
}
