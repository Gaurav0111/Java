package Recursion;

public class PalindromeNumber {
    // static boolean palindromeNumber(int num,int result,int cpy){
        
    // }
    static void palindromeNumber(int num,int result,int cpy){
        if(num==0){
            if(result==cpy){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            return;
        }
        int lastValue = num%10;
        result = lastValue + result*10; 
        palindromeNumber(num/10,result,cpy);
    }
    public static void main(String[] args) {
        
        palindromeNumber(151,0,151);
    }
}
