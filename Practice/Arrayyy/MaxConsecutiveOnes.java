package Practice.Arrayyy;

class Solution1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 0, 1 };
        Solution1 sl = new Solution1();
        System.out.println(sl.findMaxConsecutiveOnes(arr));
    }
}
