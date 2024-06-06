package Array;

public class FirstAndSecondLargest {
    public static void main(String[] args) {
        int arr[] = { 100, 100, 100, 90, 20, 98, 99 };
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest)
                secondLargest = arr[i];
        }
        System.out.println("First Largest " + largest);
        System.out.println("Second Largest " + secondLargest);
    }
}
