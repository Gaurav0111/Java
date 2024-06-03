package excersice.Nested_Loop;

public class NumberPattern_1 {

    static int fact(int num) {
        if (num <= 1) {
            return num;
        }
        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    System.out.print("1 ");
                } else {

                    System.out.print(fact(i) / (fact(j) * (fact(i - j))) + " ");
                }
            }
            System.out.println();
        }
    }
}

// package excersice.Nested_Loop;

// public class NumberPattern_1 {

// public static void main(String[] args) {
// int n = 6;
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < i; j++) {

// }
// System.out.println();
// }
// }
// }
