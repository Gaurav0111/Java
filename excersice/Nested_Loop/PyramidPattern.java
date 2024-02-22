package excersice.Nested_Loop;

public class PyramidPattern {
    public static void main(String[] args) {
        int num = 4;
        int spaces = num - 1;
        for (int row = 1; row <= num; row++) {
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            spaces--;
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
