package DS.Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2)
            stack.push(num);
        for (int i = 0; i < nums1.length; i++) {
            int index = stack.indexOf(nums1[i]);
            boolean result = false;
            while (index  < nums2.length) {
                if (nums2[index] > nums1[i]) {
                    nums1[i] = nums2[index];
                    result = true;
                    break;
                }
                index++;
            }
            if (!result)
                nums1[i] = -1;
        }
        return nums1;
    }

    public static void main(String[] args) {
        // int nums1[] = { 4, 1, 2 }, nums2[] = { 1, 3, 4, 2 };
        int nums1[] = { 3,1,5,7,9,2,6}, nums2[] = { 1,2,3,5,6,7,9,11};
//         [3,1,5,7,9,2,6]
// nums2 =
// [1,2,3,5,6,7,9,11]
        int result[] = nextGreaterElement(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
