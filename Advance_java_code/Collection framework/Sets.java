import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> hashset = new HashSet<>();
        hashset.add(452);
        hashset.add(451);
        hashset.add(453);
        hashset.add(450);
        System.out.println("hashSet"+hashset);
        hashset.remove(453);
        System.out.println(hashset);

        Set<Object> linkedhashset = new LinkedHashSet<>();
        linkedhashset.add(121);
        linkedhashset.add(123);
        linkedhashset.add(122);
        linkedhashset.add(125);
        linkedhashset.add(124);
        System.out.println("LinkedHashSet: "+linkedhashset);

        Set<Object> treeset = new TreeSet<>();
        treeset.add(352);
        treeset.add(351);
        treeset.add(353);
        treeset.add(356);
        treeset.add(355);
        treeset.add(354);
        System.out.println("TreeSet"+treeset);
        
        System.out.println("Union "+treeset.addAll(linkedhashset));
        System.out.println("TreeSet"+treeset);
        
        System.out.println("Intersection "+treeset.retainAll(linkedhashset));
        System.out.println("TreeSet"+treeset);


        Iterator<Integer> it = hashset.iterator();
        System.out.print("Iterator Class Implementation: \t");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
