package String;

import java.util.*;

public class KeyboardRow {

    public static boolean firstRowWord(String str) {
        String row = "qwertyuiop";
        return true;
    }

    public static boolean secondRowWord(String str) {
        String row = "asdfghjkl";
        return true;
    }

    public static boolean thirdRowWord(String str) {
        String row = "zxcvbnm";
        return true;
    }

    public static String[] findWords(String[] words) {
        List<String> resultList = new ArrayList<>();
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        for (String str : words) {
            if (firstRow.contains("" + str.charAt(0))) {
                if (firstRowWord(str))
                    resultList.add(str);
            } else if (secondRow.contains("" + str.charAt(0))) {
                if (secondRowWord(str))
                    resultList.add(str);
            } else if (thirdRow.contains("" + str.charAt(0))) {
                if (thirdRowWord(str))
                    resultList.add(str);
            }
        }

        return resultList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String words[] = { "Hello", "Alaska", "Dad", "Peace" };
        // System.out.println(findWords(words));
        String result[] = findWords(words);
        for (String str : result)
            System.out.print(str + " ");
    }
}
