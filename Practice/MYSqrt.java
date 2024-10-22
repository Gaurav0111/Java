package Practice;

public class MYSqrt {
    public static int mySqrt(int x) {
        for(int i=1;i<x;i++){
            // System.out.print(i+" ");
            if(i*i==x){
                return i;
            }
            else if(i*i>x){
                return i-1;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}
