package excersice.Nested_Loop;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 10, num_1 = 0, num_2 = 1;
        System.out.println(num_1);
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num_2 + " ");
                int temp = num_2;
                num_2 = num_1 + num_2;
                num_1 = temp;
            }
            System.out.println();
        }
    }
}
