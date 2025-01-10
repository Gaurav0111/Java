
import java.io.*;
import java.lang.*;

// } Driver Code Ends
// User function Template for Java
class GivenSumSortedArray {

    int countPairs(int arr[], int target) {

        int count = 0, left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                count++;
                // left++;
                right--;
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] + arr[j] > target) {
        //             break;
        //         }
        //         if (arr[i] + arr[j] == target) {
        //             count++;
        //         }
        //     }
        // }
        return count;
    }
}

//{ Driver Code Starts.
public class Gfg_given_sum_in_a_sorted_array {

    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        // while (t-- > 0) {
        //     String[] inputLine = br.readLine().trim().split(" ");
        //     for (int i = 0; i < inputLine.length; i++) {
        //         arr[i] = Integer.parseInt(inputLine[i]);
        //     }
        //     inputLine = br.readLine().trim().split(" ");
        //     int target = Integer.parseInt(inputLine[0]);
        int[] arr = {-1, 1, 5, 5, 7};
        int target = 6;
        GivenSumSortedArray obj = new GivenSumSortedArray();
        int res = obj.countPairs(arr, target);
        System.out.println(res);
        // System.out.println("~");
    }
}
// }
// } Driver Code Ends
