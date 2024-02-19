package Advance_java_code;

import java.util.LinkedList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        List<String> myList = new LinkedList<>();

        // Adding elements to the list
        myList.add("Java");
        myList.add("Collections");
        myList.add("Framework");

        // Iterating over the list
        for (String element : myList) {
            System.out.println(element);
        }
    }
}
