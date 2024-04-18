package TreeRecursion;
import java.util.*;
public class SubsequenceofString {

    static List<String> generateSubSequence(String str){
        if(str.length() == 0){
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // recursive call
        List<String> finalList = new ArrayList<>();
        List<String> tempList =  generateSubSequence(str.substring(1));
        for(int i = 0; i<tempList.size();i++){
            finalList.add(tempList.get(i));
            finalList.add(str.charAt(0)+tempList.get(i));
        }
        return finalList;
    }

    public static void main(String[] args) {
        // generateSubSequence("gaurav");
        System.out.println(generateSubSequence("gaurav"));
    }
}
