package excersice;

public class ReverseNumber {
    public static void main(String[] args) {
        int num =123,result=0;
        while(num!=0){
            int n = num%10;
            result = (result*10)+n;
            num /= 10;
        }
        System.err.println(result);
    }
}
