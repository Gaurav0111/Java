package String;

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        boolean result = false;

        return result ? nums[0] : -1;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(nums, 0));
    }
}
