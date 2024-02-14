package excersice;
public class PrimeNumber {
    public static void main(String[] args) {
        int num = 18;
        for(int i = 2;i<=Math.sqrt(num);i++){
            if ((num%i)==0){
                System.err.println("Not a prime number");
                return;
            }
        }
        System.err.println("prime number");

        // int num = 17;
        // for(int i = 2;i<num;i++){
        //     if ((num%i)==0){
        //         System.err.println("Not a prime number");
        //         return;
        //     }
        //     // else if(i == (num-1)){
        //     //     System.err.println("prime number");
        //     // }
        // }
        // System.err.println("prime number");
    }
}
