import java.util.Scanner;

public class AnyBaseToDecimal {
    public static int decimalTo(int num, int n, int i) {
        if (num <= 0) {
            int result = 0;
            return result;
        }
        int result = decimalTo(num / 10, n, i + 1);
        result += (num % 10) * ((int) Math.pow(n, i));
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any numeric value: ");
        int num = scanner.nextInt();
        System.out.print("Enter base of given numeric value: ");
        int n = scanner.nextInt();
        System.out.println("Decimal of given numeric value: " + decimalTo(num, n, 0));
        scanner.close();
    }
}
