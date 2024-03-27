package Recursion;

public class ArmstrongNumber {

    static int countValue(int num){
        if(num==0){
            return 0;
        }
        int count = countValue(num/10);
        count++;
        return count;
    }

    static int power(int num,int val){
        if(val==0){
            return 1;
        }
        int result = power(num,val-1);
        // num*num;
        return result*num;
    }

    static void number(int num,int sum,int cpy){
        if(num==0){
            if(sum==cpy){
                System.out.println("Armstrong Number");
            }
            else{
                System.out.println("Not a Armstrong Number");
            }
            return;
        }
        int digit = num%10;
        int cube = power(digit, countValue(cpy));
        // int cube = (int)Math.pow(digit, countValue(cpy));
        number(num/10,sum+cube,cpy);
    }

    public static void main(String[] args) {
        int num = 153; 
        number(num,0,num);
    }
}
