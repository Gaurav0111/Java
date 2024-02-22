package excersice;

public class PrintDigit {
    public static void main(String[] args) {
        int num = 12345;
        int num1 = num;
        int count = 0;
        while (num1>0) {
            count += 1;
            num1 /= 10;
        }
        while(num>0){
            count -= 1;
            System.out.println(num/(int)Math.pow(10, count));
            num %= (int)Math.pow(10, count);
        }
    }
}
