package Recursion.String;

public class StringReverse {
    
    static String reverse(String name){
        if(name == ""){
            return name;
        }
        String result = reverse(name.substring(1));
        return result+name.charAt(0);
    }

    public static void main(String[] args) {
        String name = "gaurav";
        // name.charAt(0);
        System.out.println(reverse(name));    
    }
}
