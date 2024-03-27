import java.util.*;

public class Mapping {
    public static void main(String[] args) {
        
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(4, "Four");
        hashMap.put(2, "Two");
        hashMap.put(7, "Two");
        System.out.println("HashMap: " + hashMap);

        Set<Object> hasSet = new HashSet<>();
        Set<Object> treeSet = new TreeSet<>();
        

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "Four");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(4, "One");
        treeMap.put(5, "One");
        treeMap.put(6, "One");

        System.out.println("TreeMap: " + treeMap);
    }
}
