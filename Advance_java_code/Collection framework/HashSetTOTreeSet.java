import java.util.*;
public class HashSetTOTreeSet {
    public static void main(String[] args) {
        Set <Object> set = new LinkedHashSet<>();
        set.add(541); 
        set.add(545);
        set.add(540); 
        set.add(542); 
        set.add(544); 
        set.add(543); 
        System.out.println("LinkedHashSet: "+set);
        Set <Object> hashSet = new HashSet<>(set);
        System.out.println("HashSet: "+hashSet);
        Set <Object> treeSet = new TreeSet<>(set);
        System.out.println("TreeSet: "+treeSet);
    }
}
