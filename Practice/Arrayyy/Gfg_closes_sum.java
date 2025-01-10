
import java.io.*;
import java.util.*;

public class Gfg_closes_sum {

    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int t = Integer.parseInt(br.readLine());
        // while (t-- > 0) {

        // String line = br.readLine();
        // String[] tokens = line.split(" ");
        ArrayList<Integer> array = new ArrayList<>();

        // for (String token : tokens) {
        // array.add(Integer.parseInt(token));
        // }
// 
        int[] arr = {5, 2, 7, 1, 4};
        int target = 10;

        ClosesSum ob = new ClosesSum();
        List<Integer> res = ob.sumClosest(arr, target);
        if (res.isEmpty()) {
            System.out.print("[]");
        } else {
            for (Integer num : res) {
                System.out.print(num + " ");
            }
        }
    }
}
// }
// } Driver Code Ends

// User function Template for Java
class ClosesSum {

    public List<Integer> sumClosest(int[] arr, int target) {

        // code here
        int num1 = arr[0], num2 = arr[1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                int currSum = arr[i] + arr[j];
                int currDiff = Math.abs(currSum - target);
                int Sum = num1 + num2;
                int Diff = Math.abs(Sum - target);
                if (currDiff < Diff && currSum < target) {
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add((num1 < num2) ? num1 : num2);
        list.add((num1 > num2) ? num1 : num2);
        return list;
    }
}
