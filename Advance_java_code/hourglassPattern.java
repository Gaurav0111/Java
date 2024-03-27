import java.util.Scanner;

public class hourglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = 3; // sc.nextInt();
        for (int i = height - 1; i >= 0; i--) {
            for (int j = height - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < height; i++) {
            for (int j = height - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
