package excersice;

public class FlipDigitWithPosition {
    public static void main(String[] args) {
        int num=32145,count=0,result=0;
        while (num>0) {
            // double temp = num%10;
            count+=1;
            result += count*((int)Math.pow(10, ((num%10)-1)));
            num = num/10;
            // result += temp1;
        }
        System.err.println(result);
    }
}
