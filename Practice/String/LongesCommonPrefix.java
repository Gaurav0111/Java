package String;

public class LongesCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        String result = "";
        try{

            for (int i = 0; i < str[0].length(); i++) {
                int j = 0;
                while (j < str.length - 1) {
                    if (str[j].charAt(i) != str[j + 1].charAt(i)) {
                    break;
                }
                j++;
            }
            if (j == str.length - 1)
                result += str[0].charAt(i);
                else
                break;
            }
        }
        catch(Exception e){
            return result;
        }
        return result;
    }

    public static void main(String[] args) {
        // String str[] = { "flower", "flow", "flight" };
        String str[] = { "ab","a"};
        System.out.println(longestCommonPrefix(str));
    }
}
