package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[ /n/t]";
        ArrayList result = new ArrayList<>();
        int n = scanner.nextInt();
        scanner.next();
        for (int i = 0; i < n; i++) {
            String list = scanner.nextLine();
            result.add(list);
        }
        System.out.println("q: ");
        int q = scanner.nextInt();
        scanner.next();
        for (int i = 0; i < q; i++) {
            String list[] = scanner.nextLine().split(regex);
            for(String val: list){
                System.out.println(val);
            }
        }
    }
}
