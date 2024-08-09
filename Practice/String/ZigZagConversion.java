package String;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        String result = "";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(index);
            index = (index + numRows + 1) % s.length();
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 3));
    }
}