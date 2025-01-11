
import java.io.*;
import java.lang.*;
import java.util.*;

public class Gfg_Top_K_Frequent_in_Array {

    public static void main(String args[]) throws IOException {
        // taking input using class Scanner
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int t = Integer.parseInt(br.readLine());

        // while (t-- > 0) {
        //     // taking total number of elements
        //     int k = Integer.parseInt(br.readLine());
        //     String line = br.readLine();
        //     String[] tokens = line.split(" ");
        //     // Create an ArrayList to store the integers
        //     ArrayList<Integer> array = new ArrayList<>();
        //     // Parse the tokens into integers and add to the array
        //     for (String token : tokens) {
        //         array.add(Integer.parseInt(token));
        //     }
        // int[] arr = {22, 66, 76, 15, 52, 29, 67, 87};
        // int k = 8;
        int[] arr = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        int k = 4;
        //     int idx = 0;
        //     for (int i : array) arr[idx++] = i;
        ArrayList<Integer> res = new Top_K_Frequent_in_Array().topKFrequent(arr, k);

        // printing the elements of the ArrayList
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
        System.out.println();
        System.out.println("~");
    }
}
// }
// } Driver Code Ends

// User function Template for Java
class Top_K_Frequent_in_Array {

    public ArrayList<Integer> topKFrequent(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        System.out.println(map);
        for (int i = 0; i < k; i++) {
            int max = 0;
            int ele = 0;
            for (int j = 0; j < arr.length; j++) {
                if (!map.containsKey(arr[j])) {
                } else if (map.get(arr[j]) >= max) {
                    max = map.get(arr[j]);
                    ele = arr[j];
                }
            }
            result.add(ele);
            map.remove(ele);
        }
        // System.out.println();
        return result;
    }
}
