// package Advance_java_code;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<Object> mixedList = new ArrayList<>();
        List list=new ArrayList();
        list.add("asdg");
        list.add(45);
        
        mixedList.add("Hello, World!");  // String
        mixedList.add(42);                // Integer
        mixedList.add(3.14);              // Double
        mixedList.add(0,3.14);              // Double
        // System.out.println(list.ge);
        Collections.sort(null);
        System.out.println(list);
        System.out.println(mixedList);
        System.out.println(mixedList.get(0));
        System.out.println(mixedList.set(0,"ahsgdj"));
        System.out.println(mixedList);
        mixedList.remove(0);              // Double
        System.out.println(mixedList);
        
        Iterator<Object> iterator = mixedList.iterator();
        
        // Using Iterator to iterate through the list
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
