package Array;

public class StringToIntegerAtoi {
    public static int myAtoi(String s) {
        int i = 0;
        String result = "";
        while (s.charAt(i) == ' ') {
            i++;
        }
        if (s.charAt(i) == 45 || s.charAt(i) == 43) {
            result += s.charAt(i) == 45 ? '-' : '+';
            i++;
        }
        while (i < s.length()) {
            if (s.charAt(i) < 48 || s.charAt(i) > 57)
                break;
            else
                result += s.charAt(i);
            i++;
        }
        if (result == "") {
            result = "0";
        }
        System.out.println(result);
        // return Integer.parseInt(result);
        try {
            return Integer.parseInt(result);
        } catch (Exception e) {
            if (result.length() == 1) {
                return 0;
            }
            return result.charAt(0) == '-' ? -2147483648 : 2147483647;

        }
    }

    public static void main(String[] args) {
        // System.out.println(myAtoi(" -042"));
        // System.out.println(myAtoi("words and 987"));
        // System.out.println(myAtoi("1337c0d3"));
        // System.out.println(myAtoi("0-1"));
        // System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("+1"));
    }
}
