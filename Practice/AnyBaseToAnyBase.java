import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static int decimalTo(int num, int n_1, int n_2, int i) {
        if (num <= 0) {
            int result = 0;
            return result;
        }
        int result = decimalTo(num / n_2, n_1, n_2, i + 1);
        result += (num % n_2) * ((int) Math.pow(n_1, i));
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any numeric value: ");
        int num = scanner.nextInt();
        System.out.print("Enter base of given numeric value: ");
        int n_1 = scanner.nextInt();
        System.out.print("Enter base in which above number has to be converted: ");
        int n_2 = scanner.nextInt();
        System.out.println("Decimal of given numeric value: " + decimalTo(num, n_1, n_2, 0));
        scanner.close();
    }
}
