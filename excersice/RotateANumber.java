package excersice;

import java.util.Scanner;
public class RotateANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter number of rotation: ");
        int rotation = sc.nextInt();
        int  num = 12345,num1=num,count=0;
        while(num1>0){
            count += 1;
            num1 /= 10;
        }
        rotation = rotation%count;
        if(rotation<0){
            rotation += count;
        }
        for(int i=0;i<rotation;i++){
            int lastDighit = num%10;
            num = num/10;
            int temp = (int)Math.pow(10, count-1);
            num += (lastDighit*temp);
        }
        System.err.println(num);
    }
}
