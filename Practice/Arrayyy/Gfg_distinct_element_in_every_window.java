
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Gfg_distinct_element_in_every_window {

    public static void main(String args[]) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int t = Integer.parseInt(br.readLine());
        // while (t > 0) {
        //     String line = br.readLine();
        //     String[] tokens = line.split(" ");

        //     ArrayList<Integer> array = new ArrayList<>();
        //     for (String token : tokens) {
        //         array.add(Integer.parseInt(token));
        //     }
        //     int idx = 0;
        //     for (int i : array) arr[idx++] = i;
        //     int k = Integer.parseInt(br.readLine());
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        ArrayList<Integer> ans = new Distinct_Element_in_Every_Window().countDistinct(arr, k);

        for (Integer val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();

        // t--;
        System.out.println("~");
    }
}
// }
// } Driver Code Ends

class Distinct_Element_in_Every_Window {

    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<=arr.length-k;i++){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=0;j<k;j++){
                map.put(arr[i+j],0);
            }
            result.add(map.size());
        }
        return result;
    }
}
