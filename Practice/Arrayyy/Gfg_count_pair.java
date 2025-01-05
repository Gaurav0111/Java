
//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Solution111 {
    int countPairs(int arr[], int target) {
        // Your code here
        int count = 0;
        Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     for(int j =i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]<target)
        //             count++;
        //     }
        // }
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]<target){
                count += right-left;
                left++;
            }
            else{
                right--;
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