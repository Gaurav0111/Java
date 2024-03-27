package Recursion;

public class PrintDigit {
    static void print(int num){
        if(num==0){
            return;
        }
        // System.out.println(num);
        print(num/10);
        System.out.println(num%10);
    }
    public static void main(String[] args) {
        print(12345);
    }
}
