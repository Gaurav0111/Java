import java.util.Scanner;

public class DecimalToAnyBase {
    public static int decimalTo(int num, int n, int i) {
        if (num <= 0) {
            int result = 0;
            return result;
        }
        int result = decimalTo(num / n, n, i + 1);
        result += (num % n) * ((int) Math.pow(10, i));
        return result;
    }

    public static void main(String[] args) {
        // int num = 634, n = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Decimal Value: ");
        int num = scanner.nextInt();
        System.out.print("Enter base value in which you want to change: ");
        int n = scanner.nextInt();
        System.out.println(decimalTo(num, n, 0));
        scanner.close();
    }
}
