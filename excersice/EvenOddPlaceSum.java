package excersice;

public class EvenOddPlaceSum {
    public static void main(String[] args) {
        int oddSum=0,evenSum=0,num1 = 54,count=0;
        
        while(num1>0){
            count ++;
            int num = num1%10;
            if(count%2==0){
                evenSum+=num;
            }
            else{
                oddSum+=num;
            }
            num1 /= 10;
        }
        System.err.println("Even Sum: "+evenSum);
        System.err.println("Odd Sum: "+oddSum);
    }
}
