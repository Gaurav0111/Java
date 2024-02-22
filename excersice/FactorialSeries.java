package excersice;

import java.util.Scanner;
public class FactorialSeries {
    static int fact(int num){
        int result = 1;
        for(int i=1;i<=num;i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 =num;
        int result=0;
        int count =0;
        while(num>0){
            count += 1;
            System.out.print(count+"/"+count+"!");
            if(count<num1){
                System.out.print(" + ");
            }
            int factorial = fact(num);
            result += num/factorial;
            num -= 1;
        }
        System.out.println("\nResult: "+result);
    }
}
