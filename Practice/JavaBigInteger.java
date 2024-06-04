import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner scanner =   new Scanner(System.in);
        BigInteger num_1 = scanner.nextBigInteger();
        BigInteger num_2 = scanner.nextBigInteger();
        System.out.println(num_1.add(num_2));
        System.out.println(num_1.multiply(num_2));
    }
}
