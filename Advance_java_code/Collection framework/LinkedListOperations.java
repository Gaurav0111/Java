// package Advance_java_code;

import java.util.*;

public class LinkedListOperations {
    public static void main(String[] args) {
        Queue<Object> linkedList = new LinkedList<>();

        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(8);
        linkedList.add(1);

        System.out.println("Original LinkedList: " + linkedList);

        // Searching
        int searchElement = 8;
        if (linkedList.contains(searchElement)) {
            System.out.println("Element " + searchElement + " found in the LinkedList.");
        } else {
            System.out.println("Element " + searchElement + " not found in the LinkedList.");
        }

        // Sorting
        // Collections.sort(linkedList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // Insertion at a specific position
        int indexToInsert = 2;
        int elementToInsert = 6;
        // linkedList.add(indexToInsert, elementToInsert);
        System.out.println("LinkedList after inserting " + elementToInsert + " at index " + indexToInsert + ": " + linkedList);

        // Deletion
        int indexToDelete = 1;
        linkedList.remove(indexToDelete);
        System.out.println("LinkedList after deleting element at index " + indexToDelete + ": " + linkedList);
    }
}
