package excersice.Nested_Loop;

public class NumberVPattern {
    public static void main(String[] args) {
        int n = 6;
        int space = (2 * n) - 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            if (i != n) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            }
            else{
                for (int j = i-1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            }
            space -= 2;
            System.out.println();
        }

    }
}
