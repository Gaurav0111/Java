package Practice.String;

public class NumberOfMatchingSubSequences {
    public static int numMatchingSubseq(String s, String[] words) {
        return 8;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String[] words = { "a", "bb", "acd", "ace" };
        System.out.println(numMatchingSubseq(s, words));
    }
}
