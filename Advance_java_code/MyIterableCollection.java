import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIterableCollection implements Iterable<String> {
    private List<String> elements = new ArrayList<>();

    // Constructor, add elements, etc.
    public MyIterableCollection() {
        elements.add("Apple");
        elements.add("Banana");
        elements.add("Orange");
    }

    @Override
    public Iterator<String> iterator() {
        return elements.iterator();
    }

    public static void main(String[] args) {
        MyIterableCollection myCollection = new MyIterableCollection();

        // Using for-each loop (implicitly using Iterable and Iterator)
        System.out.println("Using for-each loop:");
        for (String element : myCollection) {
            System.out.println(element);
        }

        // Using explicit Iterator
        List<String> elements1 = new ArrayList<>();
        elements1.add("asdasd");
        elements1.add("asdasd1");
        elements1.add("asdasd2");
        elements1.add("asdasd3");
        System.out.println("\nUsing explicit Iterator:");
        Iterator<String> iterator = elements1.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
