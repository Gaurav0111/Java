package Recursion;

public class NumberOfZeros {

    static void zeros(int num, int count){
        if(num==0){
            System.out.println("Number of Zeros: "+count);
            return;
        }
        if(num%10==0){
            count += 1;
        }
        zeros(num/10, count);
    }
    public static void main(String[] args) {
        zeros(100, 0);
    }
}
