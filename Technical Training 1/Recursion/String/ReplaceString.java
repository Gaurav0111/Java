package Recursion.String;

public class ReplaceString {

    static String reapalceWithHello(String str){
        if(str.length()==1){
            return str;
        }
        
        if (str.charAt(0)=='h' && str.charAt(1)=='i') {
            String result = reapalceWithHello(str.substring(2));
            return "hello" + result;
        }
        else{
            String result = reapalceWithHello(str.substring(1));
            return str.charAt(0)+result;
        }

    }

    public static void main(String[] args) {
        String str = "hi Amit hi tom";
        System.out.println(reapalceWithHello(str));
    }
}
