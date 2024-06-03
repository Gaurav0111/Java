package excersice.Nested_Loop;

public class Rombus {
    public static void main(String[] args) {
        int n = 5, innerSpace = -1, outerSpace = n / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= outerSpace; j++)
                System.out.print("  ");
            System.out.print("* ");
            for (int j = 1; j <= innerSpace; j++)
                System.out.print("  ");
            if (i > 1 && i < n) {
                System.out.print("* ");
            }
            if (i <= n / 2) {
                outerSpace--;
                innerSpace += 2;
            } else {
                outerSpace++;
                innerSpace -= 2;
            }
            System.out.println();
        }
    }
}
