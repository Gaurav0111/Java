// package Practice;

import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("interger: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.print("nextline: ");
        String name = scanner.nextLine();
        System.out.print("next:");
        String name_1 = scanner.next();
        System.out.println("int: "+num);
        System.out.println("nextline: "+name);
        System.out.println("next: "+name_1);
        scanner.close();
    }
}
