package excersice.Nested_Loop;

public class StarAndSpace {
    public static void main(String[] args) {
        int n = 5;
        int space = 1;
        int star = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++)
                System.out.print("* ");
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++)
                System.out.print("* ");
            System.out.println();
            if (i <= n / 2) {
                space += 2;
                star -= 1;
            } else {
                space -= 2;
                star += 1;
            }
        }
    }
}
