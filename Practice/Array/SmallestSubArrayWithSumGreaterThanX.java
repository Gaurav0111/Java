package Array;

public class SmallestSubArrayWithSumGreaterThanX {
    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here
        int maxLength = Integer.MAX_VALUE;
        int sum = 0;
        int first = 0;
        for (int end = 0; end < a.length; end++) {
            sum += a[end];
            while (sum > x && first <= end) {
                maxLength = Math.min(maxLength, end - first + 1);
                System.out.println(first + " " + end);
                sum -= a[first];
                first++;
            }
        }
        if (maxLength == Integer.MAX_VALUE) {
            return 0;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int a[] = { 1, 4, 45, 6, 0, 19 };
        int x = 51;
        System.out.println(smallestSubWithSum(a, 5, x));
    }
}
