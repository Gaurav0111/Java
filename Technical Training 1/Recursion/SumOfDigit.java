package Recursion;

public class SumOfDigit {
    static int sum(int num){
        if (num==0) {
            return 0;
        }
        int result = sum(num/10);
        result += num%10;
        return result;
    }

    static void sum(int num,int result){
        if(num == 0){
            System.out.println(result);
            return;
        }
        result += num%10;
        sum(num/10,result);
    }
    public static void main(String[] args) {
        sum(123,0);
        System.out.println(sum(123));
    }
}
