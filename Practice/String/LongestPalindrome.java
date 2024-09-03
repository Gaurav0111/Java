package String;

public class LongestPalindrome {

    static boolean helper(String str) {
        char ch;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            result = ch + result;
        }
        return str.endsWith(result);
    }

    public static String longestPalindrome(String s) {
        String result = ""+s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            int start = i + 1;
            String temp = "" + s.charAt(i);
            while (start < s.length()) {
                if ((result.length() < temp.length()) && helper(temp)) {
                    result = temp;
                }
                temp += s.charAt(start);
                start += 1;
            }
            start = 0;
            temp = "";
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "aabaa";
        // String s = "cbbd";
        // String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
