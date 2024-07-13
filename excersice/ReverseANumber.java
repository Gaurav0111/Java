package excersice;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 1534236469;
        // 2147483647
        int cpy = num;
        int result = 0;
        int length = 0;
        if(num<0){
            boolean negetive = true;
            num = Math.abs(num);
        }
        while (cpy > 0) {
            cpy = cpy / 10;
            length++;
        }
        for (int i = 0; i < length; i++) {
            cpy = num % 10;
            result = cpy + result * 10;
            num = num / 10;
        }
        System.out.println(result);
    }
}
