
//{ Driver Code Starts
import java.io.*;
import java.lang.*;

class Solution111 {
    int countPairs(int arr[], int target) {
        // Your code here
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]+arr[j]<target)
                    count++;
            }
        }
        return count;
    }
}



//{ Driver Code Starts.

class Gfg_count_pair {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        // int t = Integer.parseInt(read.readLine());

            int nums[] = {7,2,5,3};
            // int target = Integer.parseInt(read.readLine());
            int target = 8;
            Solution111 obj = new Solution111();

            System.out.println(obj.countPairs(nums, target));

            System.out.println("~");
        }
    }
// }
// } Driver Code Ends