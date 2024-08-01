package String;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String str = "";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    char ch = (char) (s.charAt(i) + 32);
                    str = str + ch;
                    result = ch + result;
                } else {
                    str = str + s.charAt(i);
                    result = s.charAt(i) + result;
                }
            }
        }

        System.out.println(s.charAt(0) > 65);
        System.out.println(str);
        System.out.println(result);
        // return str.toLowerCase().equals(result.toLowerCase());
        return str.equals(result);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        // String s = "gaurav";
        // String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
