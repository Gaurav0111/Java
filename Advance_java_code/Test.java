import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Object, Object> map = new LinkedHashMap<>();
        map.put("123", "John Smith");
        map.put("123", "Steve Yao");
        map.put("111", "George Smith");
        map.put("222", "Steve Yao");
        System.out.println("(1) " + map);
        System.out.println("(2) " + new TreeMap<>(map));
    }
}