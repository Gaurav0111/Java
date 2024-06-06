import java.util.Scanner;

public class GreaterInFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third number:");
        int num3 = sc.nextInt();
        System.out.println("Enter fourth number:");
        int num4 = sc.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                if (num1 > num4) {
                    System.out.println("First is greater");
                } else {
                    System.out.println("Fourth is greater");
                }
            } else {
                System.out.println("Third is greater");
            }
        } else {
            if (num2 > num4) {
                if (num2 > num3) {
                    System.out.println("Second is greater");
                } else {
                    System.out.println("Third is greater");
                }
            } else {
                System.out.println("Fourth is greater");
            }
        }
    }
}