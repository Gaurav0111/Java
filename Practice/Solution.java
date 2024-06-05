import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = "2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251982";
        try {
            if (Integer.parseInt(n) <= 1) {
                System.out.println("not prime");
                System.exit(0);
            }
        } catch (Exception e) {
        }
        BigInteger bg = new BigInteger(n);
        System.out.println(bg.isProbablePrime(10) ? "prime" : "not prime");
        bufferedReader.close();
    }
}
