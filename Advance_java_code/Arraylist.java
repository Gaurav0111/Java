package Advance_java_code;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Object> mixedList = new ArrayList<>();

        mixedList.add("Hello, World!");  // String
        mixedList.add(42);                // Integer
        mixedList.add(3.14);              // Double

        // Using Iterator to iterate through the list
        Iterator<Object> iterator = mixedList.iterator();

        while (iterator.hasNext()) {
            Object element = iterator.next();

            if (element instanceof String) {
                System.out.println("String: " + element);
            } else if (element instanceof Integer) {
                System.out.println("Integer: " + element);
            } else if (element instanceof Double) {
                System.out.println("Double: " + element);
            }
        }
    }
}
