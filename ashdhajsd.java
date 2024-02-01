import java.util.Scanner;

public class ArraySwitch {
    public static void bubbleSort(int[] array, int n) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static int linearSearch(int[] arr, int num) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == num) {
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos, number, key;
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size + 1];
        System.out.println("Enter an array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Choice 1: Insertion");
        System.out.println("Choice 2: Deletion");
        System.out.println("Choice 3: Sort an array");
        System.out.println("Choice 4: Search an element");
        System.out.println("Enter the choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the position: ");
                pos = sc.nextInt();
                System.out.println("Enter the number you want to insert: ");
                number = sc.nextInt();
                for (int i = size - 1; i >= pos - 1; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[pos - 1] = number;
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println(arr[size]);
                break;
            case 2:
                System.out.println("Enter the position: ");
                pos = sc.nextInt();
                for (int i = pos; i <= size - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                size--;
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println(arr[size]);
                break;
            case 3:
                bubbleSort(arr, size);
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;
            case 4:
                System.out.println("Enter the number you want to search: ");
                key = sc.nextInt();
                int result = linearSearch(arr, key);
                if (result != -1)
                    System.out.println("Element found at index: " + result);
                else
                    System.out.println("Element not found!!");
                break;
            default:
                System.out.println("Invalid choice!!");
                break;
        }
    }
}