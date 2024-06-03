package excersice.Nested_Loop;

public class Diagonal {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        while (n > 0) {
            for(int i=1;i<=space;i++)System.out.print("  ");
            System.out.println("* ");
            n--;
            space++;
        }
        n = 5;
        space = 5;
        while (n > 0) {
            n--;
            space--;
            for(int i=1;i<=space;i++)System.out.print("  ");
            System.out.println("* ");
        }
    }
}
