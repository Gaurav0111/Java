import java.util.Scanner;

public class AnyBaseSubtraction {

    public static int convert(int num, int n_1, int n_2, int i) {
        if (num <= 0) {
            int result = 0;
            return result;
        }
        int result = convert(num / n_2, n_1, n_2, i + 1);
        result += (num % n_2) * ((int) Math.pow(n_1, i));
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int num = scanner.nextInt();
        System.out.print("Enter first value with base " + num + ": ");
        int num_1 = scanner.nextInt();
        System.out.print("Enter second value with base " + num + ": ");
        int num_2 = scanner.nextInt();
        num_1 = convert(num_1, num, 10, 0);
        num_2 = convert(num_2, num, 10, 0);
        int result = num_1 + num_2;
        System.out.println(convert(result, 10, num, 0));
    }
}
