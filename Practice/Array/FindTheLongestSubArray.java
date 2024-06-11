package Array;

public class FindTheLongestSubArray {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 7, 4, 2, 1, 1, 5 };
        int k = 8;
        int left = 0;
        int size = 0;
        int sum = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            size = Math.max(size, right-left+1);
        }
        System.out.println(size);
    }
}
