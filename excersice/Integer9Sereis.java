package excersice;
import java.util.*;
public class Integer9Sereis {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n = 9;
        for(int i =1; i <=num; i++ ){
            for (int j=0;j<i;j++){
            System.out.print(n);
            }
            if(i==num){
                return;
            }
            System.out.print("+");
        }

    }
}
