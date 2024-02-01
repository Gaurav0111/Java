import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (arr[middle] == key)
                return middle;
            else if (arr[middle] < key)
                low = middle + 1;
            else
                high = middle - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want search: ");
        int target = sc.nextInt();
        Arrays.sort(arr);
        int index = binarySearch(arr, target);
        if (index != -1)
            System.out.println(target + " found at " + index);
        else
            System.out.println(target + " not found!!");
    }
}
