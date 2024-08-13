package String;

public class CountAndSay {
    public static String helper(String s) {
        String result = "";
        if (s.length() == 1) {
            result += 1 + s;
            return result;
        }
        int i = 0;
        while (i < s.length()) {
            char first = s.charAt(i);
            int count = 1;
            if (first == s.charAt(i)) {
                while (i < s.length() && first == s.charAt(i)) {
                    count++;
                    i++;
                }
            }
            result += count - 1 + "";
            result += s.charAt(i - 1);
        }
        return result;
    }

    public static String countAndSay(int n) {
        if (n == 1)
            return "1";
        String curResult = countAndSay(n - 1);
        String result = helper(curResult);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
        // System.out.println(helper("33"));
        // System.out.println(helper("1211"));
        // System.out.println(helper("5"));
    }
}
