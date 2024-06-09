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
    }

    void print() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class JavaOperations {

    public static void main(String[] args) {
        Operation obj = new Operation(5);
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Insertion");
        System.out.println("2. Deletion");
        System.out.println("3. Update");
        System.out.println("4. Print");
        System.out.println("5. Exit");
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

                case 4:
                    obj.print();
                    break;

                case 5:
                    return;

                default:
                    break;
            }
        }
    }
}
