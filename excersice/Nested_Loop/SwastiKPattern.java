package excersice.Nested_Loop;

public class SwastiKPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n || i == n / 2 + 1 || j == n / 2 + 1) {
                    if (i > 1 && i <= n / 2 && j <= n / 2) // quater 1
                        System.out.print("  ");
                    else if (j > 1 && j <= n / 2 && i > n / 2 + 1) // quater 3
                        System.out.print("  ");
                    else if (j > n / 2 + 1 && j < n && i <= n / 2) // quater 2
                        System.out.print("  ");
                    else if (i < n && i > n / 2 + 1 && j == n) // quater 4
                        System.out.print("  ");
                    else
                        System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
