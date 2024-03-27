package Recursion.String;

public class FindAndReplace {

    static String repalceAll(String str, char search, char repalce){
        if(str==""){
            return str;
        }
        String result = repalceAll(str.substring(1), search, repalce); 
        if(str.charAt(0) == search){
            result = repalce+result;
        }
        else{
            result = str.charAt(0)+result;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(repalceAll("Hello", 'l', 'x'));
    }
}
