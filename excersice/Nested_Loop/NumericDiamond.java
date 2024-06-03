package excersice.Nested_Loop;

public class NumericDiamond {
    public static void main(String[] args) {
        int n = 5, space = 2, star = 1, data = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            int cdata = data;
            for (int j = 1; j <= star; j++) {
                System.out.print(cdata + " ");
                if (j <= star / 2) {
                    cdata++;
                } else {
                    cdata--;
                }
            }
            if (i <= n / 2) {
                data++;
                space--;
                star += 2;
            } else {
                data--;
                space++;
                star -= 2;
            }
            System.out.println();

        }
    }
}
