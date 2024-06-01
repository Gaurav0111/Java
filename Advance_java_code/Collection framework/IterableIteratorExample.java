import java.util.*;

public class IterableIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Using the enhanced for-loop (for-each loop) with Iterable
        System.out.println("Using Iterable (for-each loop):");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Using Iterator explicitly
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
