package Practice.Arrayyy;

public class FindFirstAndLastElementofSortedArray {

    public static int[] searchRange(int[] nums, int target) {
        // int result[] = new int[2];
        int first = -1;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                first = i;
                last = i;
                i++;
                while (i<nums.length &&nums[i] == target) {
                    last = i;
                    i++;
                }
            }
        }
        // result[0] = first;
        // result[1] = last;
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        // int nums[] = { 5, 7, 7, 8, 8, 10 };
        int nums[] = { 1};
        int result[] = searchRange(nums, 1);
        System.out.print('[');
        for (int i : result)
            System.out.print(i + " ");
        System.out.print(']');
    }
}
