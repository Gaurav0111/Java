import java.util.*;

public class UnorderedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> unorderedSet = new HashSet<>();
        unorderedSet.add(5);
        unorderedSet.add(2);
        unorderedSet.add(8);
        unorderedSet.add(1);

        System.out.println("Unordered HashSet: " + unorderedSet);
    }
}
