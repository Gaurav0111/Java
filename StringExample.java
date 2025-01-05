public class StringExample {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println(s1 == s2); // true (same memory location in string pool)
        System.out.println(s1 == s3); // false (s3 refers to a new object)
    }
}
