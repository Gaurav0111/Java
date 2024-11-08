package Practice.String;

public class NumberOfMatchingSubSequences {

    public static boolean helper(String str, String sub) {
        int i = 0, j = 0;
        while (i < str.length() && j < sub.length()) {
            if (str.charAt(i) == sub.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == sub.length();
    }

    public static int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        for (String str : words) {
            if (helper(s, str)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String[] words = {"a", "bb", "acd", "ace"};
        System.out.println(numMatchingSubseq(s, words));
    }
}
