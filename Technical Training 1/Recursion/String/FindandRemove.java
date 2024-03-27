package Recursion.String;

public class FindandRemove {

    static String repalceAll(String str, char search){
        if(str==""){
            return str;
        }
        String result = repalceAll(str.substring(1), search); 
        if(str.charAt(0) != search){
            result = str.charAt(0)+result;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(repalceAll("Hello", 'l'));
    }
}
