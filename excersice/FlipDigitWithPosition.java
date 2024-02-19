package excersice;

public class FlipDigitWithPosition {
    public static void main(String[] args) {
        // Math.pow(0, 0)
        int num=32145,count=0;
        double result=0;
        while (num>0) {
            double temp = num%10;
            count+=1;
            num = num/10;
            double temp1 = count*(Math.pow(10, (temp-1)));
            result += temp1;
        }
        System.err.println((int)result);
    }
}
