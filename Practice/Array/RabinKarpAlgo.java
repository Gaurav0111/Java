package Array;

public class RabinKarpAlgo {
    public static void main(String[] args) {
        String txt = "aaabcabdabcabe";
        String pattern = "abc";
        int prime = 101;
        int base = 256;
        int m = pattern.length();
        int n = txt.length();
        int pHash = 0;
        int tHash = 0;
        int h = 1;

        for (int i = 0; i < m - 1; i++) {
            h = (h * base) % prime;
        }

        for (int i = 0; i < m; i++) {
            pHash = (base * pHash + pattern.charAt(i)) % prime;
            tHash = (base * tHash + txt.charAt(i)) % prime;
        }

        for (int i = 0; i <= n - m; i++) {
            if (pHash == tHash) {
                int j;
                for (j = 0; j < m; j++) {
                    if (txt.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }
                if (j == m) {
                    System.out.println("Found: " + i);
                }
            }
            if (i < n - m) {
                tHash = (base * (tHash - txt.charAt(i) * h) + txt.charAt(i + m)) % prime;
                if (tHash < 0) {
                    tHash = (tHash + prime);
                }
            }
        }
    }
}
