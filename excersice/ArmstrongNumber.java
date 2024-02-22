package excersice;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153,num1=num,count=0,sum=0;
        while(num1>0){
            count += 1;
            num1 /= 10;
        }
        num1 = num;
        for(int i=0;i<count;i++){
            int lastDighit = num%10;
            num = num/10;
            sum += (int)Math.pow(lastDighit, count);
        }
        if(sum==num1){
            System.err.println("Armstrong Number");
        }
        else{
            System.err.println("Not a armstrong number");
        }

    }
}
