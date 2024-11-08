package Practice.Arrayyy;

public class KElementOfTwoSortedArray {
    static public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        long result[] = new long[n + m];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[index] = arr1[i];
                i++;
                index++;
            } else {
                result[index] = arr2[j];
                j++;
                index++;
            }
        }
        return result[k+1];
    }

    public static void main(String[] args) {

    }
}
