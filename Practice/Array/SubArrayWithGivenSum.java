package Array;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int first = 0;
        int sum = 0;
        for (int end = 0; end < n; end++) {
            sum += arr[end];
            while (sum > s) {
                sum -= arr[first];
                first++;
            }
            if (sum == s && first<=end) {
                list.add(first+1);
                list.add(end+1);
                return list;
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4};//, 5 };
        int n = 4, s = 0;
        System.out.println(subarraySum(arr, n, s));
    }
}
