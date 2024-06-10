package Array;

import java.util.Scanner;

class Operation {
    int arr[];
    int size = 0;

    public Operation(int capacity) {
        arr = new int[capacity];
    }

    void insert(int num, int pos) {
        if (size == arr.length) {
            System.out.println("Array already full");
            return;
        }
        for (int i = size; i >= pos - 1; i--) {
            arr[i + 1] = arr[i];
        }
        size++;
        arr[pos - 1] = num;
    }

    void delete(int pos) {
        for (int i = pos - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    int search(int num) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void Update(int num, int pos) {
        arr[pos] = num;
    }
}

public class JavaOperations {

    public static void main(String[] args) {
        Operation obj = new Operation(5);
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Insertion");
        System.out.println("2. Deletion");
        System.out.println("3. Update");
        System.out.println("4. Search");
        System.out.println("5. Print");
        System.out.println("6. Exit");
        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter element to insert: ");
                    int num = scanner.nextInt();
                    System.out.println("Enter postion in which you want to enter the number: ");
                    int pos = scanner.nextInt();
                    obj.insert(num, pos);
                    break;

                case 2:
                    System.out.println("Enter postion from where you want to delete element: ");
                    pos = scanner.nextInt();
                    obj.delete(pos);
                    break;
                case 3:
                    System.out.println("Enter new element to insert: ");
                    num = scanner.nextInt();
                    System.out.println("Enter position of new element: ");
                    pos = scanner.nextInt();
                    if (pos < 0 || pos > obj.arr.length)
                        System.out.println("Position not available");
                    else
                        obj.Update(num, pos);
                    break;

                case 4:
                    System.out.println("Enter number to search: ");
                    num = scanner.nextInt();
                    if (obj.search(num) != -1) {
                        System.out.println("Element found in index " + obj.search(num) + 1);
                    } else {
                        System.out.println("Element not found");
                    }
                case 5:
                    obj.print();
                    break;

                case 6:
                    return;

                default:
                    break;
            }
        }
    }
}
