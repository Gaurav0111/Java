package Array;

//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

import String;

public class LeaderElementArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

		while (t-- > 0) {

			// input size of array
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");

			// inserting elements in the array
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}

			Solution obj = new Solution();

			StringBuffer str = new StringBuffer();
			ArrayList<Integer> res = new ArrayList<Integer>();

			// calling leaders() function
			res = obj.leaders(arr, n);

			for (int i = 0; i < res.size(); i++) {
				ot.print(res.get(i) + " ");
			}

			ot.println();
		}
		ot.close();

	}
}

// } Driver Code Ends

class Solution {
	// Function to find the leaders in the array.
	static ArrayList<Integer> leaders(int arr[], int n) {
		ArrayList<Integer> list = new ArrayList<>();
		int largest = 0;
		for (int i = arr.length-1; i >= 0; i--)
			if (arr[i] >= largest) {
				largest = arr[i];
				list.add(0, largest);
			}
		return list;
	}
}
