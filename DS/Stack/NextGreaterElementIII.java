package DS.Stack;

public class NextGreaterElementIII {
    public static int nextGreaterElement(int n) {
        // int result = 0;
        int cpy = n;
        if (n <= 9)
            return -1;
        String result = "" + n;
        int i = result.length() - 1;
        while (i > 0) {
            int j = i - 1;
            char second = result.charAt(i);
            while (j != i) {
                // j = j % result.length();
                char first = result.charAt(j);
                result = result.substring(0, i) + first + result.substring(i + 1);
                result = result.substring(0, j) + second + result.substring(j + 1);
                // j = (j + 1) % result.length()-1;
                j--;
                if (Integer.parseInt(result) > n)
                    break;
            }
            i++;
            if (Integer.parseInt(result) > n)
                break;
            result = cpy + "";
        }
        // for (int i = result.length() - 1; i >= 1; i--) {
        // char second = result.charAt(i);
        // for (int j = result.length() - 2; j >= 1; j++) {
        // char first = result.charAt(j);
        // result = result.substring(0, i - 1) + second + result.substring(i);
        // result = result.substring(0, i) + first + result.substring(i + 1);
        // System.out.println(result);
        // }
        // // // result = result.substring(0, i - 2) + second + result.substring(i + 1);
        // // // result = result.substring(0, i + 1) + first + result.substring(i);
        // if (Integer.parseInt(result) > n)
        // break;
        // }
        return Integer.parseInt(result) > cpy ? Integer.parseInt(result) : -1;
    }

    public static void main(String[] args) {
        System.out.println(nextGreaterElement(230241));
    }
}
