import java.util.*;

public class ListToSetExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple"); // Adding a duplicate element to the list
        System.out.println("Original List: " + list);
        
        // Convert List to Set
        Set<String> set = new HashSet<>(list);
        System.out.println("Converted Set: " + set);

        Set<String> set1 = new TreeSet<>(set);
        System.out.println("Converted Set1: " + set1);

        List<String> list1 = new LinkedList<>(set);
        System.out.println("linkedList: "+list1);
    }
}
