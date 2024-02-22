package excersice;

public class StrongNumber {
    public static void main(String[] args) {
        int num = 69,num1=num,sum=0;
        while(num!= 0){
            int lastDighit = num%10;
            num = num/10;
            int result=1;
            for(int i=1;i<=lastDighit;i++){
                result *= i; 
            }
            sum += result;
        }
        System.out.println(sum==num1?"Strong Number":"Not a strong Number");
        // if (num1==sum){
        //     System.err.println("Strong Number");
        // }
        // else{
        //     System.err.println("Not a strong number");
        // }
    }
}
