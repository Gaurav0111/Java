package Array;

public class FourSumII {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int result = 0;
        int n = nums1.length - 1;
        for (int i = 0; i <= n; i++) {
            // for (int j = 0; j <= n; j++) {
            int j = 0;
            int k = 0, l = 0;
            while (j <= n) {
                long sum = (long) nums1[i] + (long) nums2[j] + (long) nums3[k] + (long) nums4[l];
                System.out.println(sum);
                if (sum == 0) {
                    result++;
                }
                if (l <= n) {
                    l++;
                }
                if (l >= n) {
                    k++;
                    l = 0;
                }
                if (k > n) {
                    j++;
                    k = 0;
                }
            }
            // }
        }
        return result;

    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2 };
        int nums2[] = { -1, -2 };
        int nums3[] = { -1, 2 };
        int nums4[] = { 0, 2 };
        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
    }
}
