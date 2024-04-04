package TreeRecursion;

public class FibonacciSeries {

    static int fibonacciSeries(int num){
        if(num<=1){
            return num;
        }
        int firstTerm = fibonacciSeries(num-1);
        int secondTerm = fibonacciSeries(num-2);
        return (firstTerm + secondTerm);
    }

    public static void main(String[] args) {
        System.out.println(fibonacciSeries(5));
    }
}
