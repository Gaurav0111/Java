package Array;

public class IsSorted {
    public static void main(String[] args) {
        int arr[] = { 100, 100, 100, 90, 20, 98, 99 };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                System.out.println("Not Sorted");
                System.exit(0);
            }
        }
        System.out.println("Sorted");
    }
}
