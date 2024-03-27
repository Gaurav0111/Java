public class ArraySyntax {
    public static void main(String[] args) {
        // int ages[] = new int[10];
        // int []ages = new int[10];
        int[] ages = new int[] { 1, 3, 6, 7, 4 };
        int age[] = { 1, 2, 3, 4 };
        System.out.println(ages);
        System.out.println(age);
        for (int i : age) {
            System.out.println(i);
        }
    }
}
