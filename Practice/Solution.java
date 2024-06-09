import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String arr[] = scanner.nextLine().split(" ");
        int left = 0, right = 0, count = 0;
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for (; left < n; left++) {
            ArrayList<String> innerList2 = new ArrayList<>();
            for (; right < n; right++) {
                // innerList2.add(Array.cop    );
            }
            list.add(innerList2);
        }
        for(String s : arr){
            System.out.println(s);
        }
        System.out.println(list);
        scanner.close();
        
    }
}