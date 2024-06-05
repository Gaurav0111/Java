package excersice.Nested_Loop;

public class HourGlassPattern {
    public static void main(String[] args) {
        int n = 13, space = n / 2, star = 1;
        for (int i = 1; i <= n; i++) {
            if (i <= n / 2) {
                for (int j = 1; j <= n; j++) {
                    if (i == j || i == 1 || i == n || j + i == n + 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            } else {
                for (int j = 1; j <= space; j++)
                    System.out.print("  ");
                for (int j = 1; j <= star; j++)
                    System.out.print("* ");
                star += 2;
                space -= 1;
            }
            System.out.println();
        }
    }
}
