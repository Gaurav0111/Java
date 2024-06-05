package excersice.Nested_Loop;

public class ArrowPattern {
    public static void main(String[] args) {
        int n = 9, star = 1;
        for (int i = 1; i <= n; i++) {
            if (i != n / 2 + 1) {
                for (int j = 1; j <= n / 2; j++)
                    System.out.print("  ");
                for (int j = 1; j <= star; j++)
                    System.out.print("* ");
            } else {
                for (int j = 1; j <= n; j++)
                    System.out.print("* ");
            }
            if (i <= n / 2)
                star++;
            else
                star--;

            System.out.println();
        }

    }
}
