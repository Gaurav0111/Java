package String;

public class RabinKarpAlgo {
    public static void main(String[] args) {
        String text = "aaabcabdabcabe";
        // String text = "aaweaabcabdabcabe";
        // String text = "aabcabdabcabe";
        String pattern = "abc";
        int textHash = 0;
        int patternHash = 0;
        int primeRange = 101;

        // hash for pattern, and first pattern.length() character of text
        for (int i = 0; i < pattern.length(); i++) {
            patternHash = (patternHash + pattern.charAt(i)) % primeRange;
            textHash = (textHash + text.charAt(i)) % primeRange;
        }

        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            if (textHash == patternHash) {
                if (text.substring(i, i + pattern.length()).equals(pattern)) {
                    System.out.println("Found: " + i);
                }
            }
            if (i < text.length() - pattern.length())
                textHash = (textHash - text.charAt(i) + text.charAt(i + pattern.length())) % primeRange;
        }
    }
}
