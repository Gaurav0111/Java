package excersice;

public class SwapFirstAndLastDigit {
    public static void main(String[] args) {
        int num=28647,num1=num,count=0;
        while (num1>1) {
            count += 1;
            num1 /= 10;
        }
        int lastDighit = num%10; //7
        int firstDigit = num/(int)Math.pow(10, count-1);  //2
        num = num/10; //2864
        int mmidDigit = num%(int)Math.pow(10, count-2); //864
        int result = (lastDighit*(int)Math.pow(10, count-1))+(mmidDigit*10)+firstDigit;
        System.out.println(result);
    }
}
