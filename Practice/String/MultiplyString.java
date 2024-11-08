package Practice.String;

import java.math.BigInteger;

public class MultiplyString {
    public static String multiply(String num1, String num2) {
        BigInteger num_1 = new BigInteger(num1);
        BigInteger num_2 = new BigInteger(num2);
        return ""+ num_1.multiply(num_2) ;
    }
    public static void main(String[] args) {
        System.out.println(multiply("123456789", "654987321"));
    }
}
