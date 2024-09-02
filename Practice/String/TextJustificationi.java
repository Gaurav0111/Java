package String;

import java.util.*;

public class TextJustificationi {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> resultList = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            String resultString = "";
            int spaceLeft = maxWidth;
            // if (i == words.length - 1) {
            // resultString += words[i];
            // spaceLeft -= words[i].length();
            // while (spaceLeft > 0) {
            // resultString += " ";
            // spaceLeft--;
            // }
            // resultList.add(resultString);
            // break;
            // }
            while (spaceLeft > 0 && i < words.length) {
                if (words[i].length() <= spaceLeft) {
                    resultString += words[i] + " ";
                    spaceLeft -= words[i].length() + 1;
                    i++;

                } else {
                    while (spaceLeft > 0) {
                        resultString += " ";
                        spaceLeft--;
                    }
                }
            }
            while (spaceLeft > 0) {
                resultString += " ";
                spaceLeft--;
            }
            resultList.add(resultString);
        }
        i=0;
        while(i<resultList.size()-1){
            String cuString = resultList.get(i);
            int space = 0;
            for(int j=0;j<cuString.length();j++){
                if(cuString.charAt(j)==' ')
                    space++;
            }
            System.out.println(space);
            i++;
        }
        // System.out.println(resultList.size());
        return resultList;
    }

    public static void main(String[] args) {
        String words[] = { "This", "is", "an", "example", "of", "text", "justification." };
        // String words[] = { "What", "must", "be", "acknowledgment", "shall", "be" };
        // String words[] = {
        // "Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"
        // };
        int maxWidth = 16;
        System.out.println(fullJustify(words, maxWidth));
    }
}
