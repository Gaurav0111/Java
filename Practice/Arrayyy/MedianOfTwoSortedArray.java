package Practice.Arrayyy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        int nums1[] = { 1, 3 };
        int nums2[] = { 2 };
        int result[] = new int[nums1.length + nums2.length];
        int index = 0, i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                result[index] = nums1[i];
                i++;
            } else {
                result[index] = nums2[j];
                j++;
            }
            index++;
        }
        while (i < nums1.length) {
            result[index] = nums1[i];
            i++;
            index++;
        }
        while (j < nums2.length) {
            result[index] = nums2[j];
            j++;
            index++;
        }
        if (result.length % 2 == 0) {
            BigDecimal dividend = new BigDecimal(result[result.length / 2] + result[result.length / 2 - 1]);
            BigDecimal divisor = new BigDecimal(2);
            BigDecimal num = dividend.divide(divisor, 5, RoundingMode.HALF_UP);
            // double num = (double) (result[result.length / 2] + result[result.length / 2 - 1]) / 2;
            System.out.println(num);
            // return num;
        } else {
            BigDecimal dividend = new BigDecimal(result[result.length / 2]);
            BigDecimal divisor = new BigDecimal(1);
            BigDecimal num = dividend.divide(divisor, 5, RoundingMode.HALF_UP);
            System.out.println(num);
            // System.out.println(result[result.length / 2]);
            // return result[result.length / 2];
        }
    }
}
