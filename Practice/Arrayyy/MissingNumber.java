package Practice.Arrayyy;

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(n, arr));
        }
    }
}
// } Driver Code Ends

// User function Template for Java
class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
        // int sum = n * (n + 1) / 2;
        // int arraySumn = 0;
        // for (int i = 0; i < arr.length; i++) {
        // arraySumn += arr[i];
        // }
        // return sum - arraySumn;
        int hash[] = new int[n + 1];
        for (int val : arr) {
            hash[val] = 1;
        }
        for (int i = 1; i < hash.length; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return 1;
    }
}
