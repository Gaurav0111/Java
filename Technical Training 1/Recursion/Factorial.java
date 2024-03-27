package Recursion;

public class Factorial {

    static int factorial(int num){
        if(num==1){
            return 1;
        }
        return num *factorial(num-1);
    }

    static void fact(int num,int result){
        if(num==1){
            System.out.println(result);
            return;
        }
        result = num*result;
        fact(num-1,result);
    }

    public static void main(String[] args) {
        fact(5, 1);
        System.out.println(factorial(5));
    }
}
