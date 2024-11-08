package Practice.Arrayyy;

public class PrefixSumDemo {
    public static void main(String[] args) {
        int org[] = { 1, 6, 3, 2, 7, 2 };
        int quries[][] = { { 0, 3 }, { 2, 4 },{2,5} };
        int prefix[] = new int[org.length];
        prefix[0] = org[0];
        for (int i = 1; i < org.length; i++) {
            prefix[i] = prefix[i - 1] + org[i];
        }
        for (int i : prefix) {
            System.out.println(i);
        }

        for (int i = 0; i < quries.length; i++) {
            int lowerbound = quries[i][0];
            int uppperBound = quries[i][1];
            int sum = prefix[uppperBound] - prefix[lowerbound-1];
            System.out.println("Sum: " + sum);
        }
    }
}
