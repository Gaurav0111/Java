
import java.io.*;
import java.util.*;

class Gfg_SubArray_With_Given_Sum {

    public static void main(String args[]) throws IOException {
        // BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        // int t = Integer.parseInt(read.readLine().trim());

        // while (t-- > 0) {
        //     String line = read.readLine().trim();
        //     String[] numsStr = line.split(" ");
        //     for (int i = 0; i < numsStr.length; i++) {
        //         nums[i] = Integer.parseInt(numsStr[i]);
        //     }
        //     int d = Integer.parseInt(read.readLine().trim());
        int[] nums = {23, 6, 28, 7};
        int d = 12;

        SubArray_With_Given_Sum ob = new SubArray_With_Given_Sum();
        ArrayList<Integer> result = ob.subarraySum(nums, d);
        // Print all elements in the result list
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a new line after the result
        // System.out.println("~");
    }
}

// } Driver Code Ends
class SubArray_With_Given_Sum {

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            int j = i;
            while (sum < target && j < arr.length - 1) {
                j++;
                sum += arr[j];
            }
            if (sum == target) {
                list.add(i + 1);
                list.add(j + 1);
                break;
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        return list;
    }
}
