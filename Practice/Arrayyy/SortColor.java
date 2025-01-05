
class Solution3 {
    public void sortColors(int[] arr) {
        int left = 0;
        int mid = 0;
        int right = arr.length - 1;
        // for (int i = 0; i < arr.length/2+1; i++) {
        while (mid <= right) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
                left++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }
}

public class SortColor {
    public static void main(String[] args) {
        Solution3 sl = new Solution3();
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sl.sortColors(arr);
        System.out.println("hry");
    }
}
