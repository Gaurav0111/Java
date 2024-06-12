package Array;

class NumArray {
    private int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i=left;i<=right;i++){
            sum += nums[i];
        }
        return sum;
    }
}
public class RangeSumQuery {
    public static void main(String[] args) {
        int nums[] = { -2, 0, 3, -5, 2, -1 };
        int num1[][] = { { 0, 2 }, { 2, 5 }, { 0, 5 } };
        NumArray nm = new NumArray(nums);
        for (int i = 0; i < num1.length; i++) {
            System.out.println(nm.sumRange(num1[i][0], num1[i][1]));
        }

    }
}
