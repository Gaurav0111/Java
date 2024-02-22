package excersice.Nested_Loop;

public class Pyramidpattern1 {
    public static void main(String[] args) {
        int num = 6;
        int spaces = num - 1;
        for (int row = 1; row <= num; row++) {
            if (row % 2 == 0) {
                continue;
            }
            for (int space = 1; space <= spaces; space++) {
                System.out.print("  ");
            }
            spaces--;
            for (int star = 1; star <= row; star++) {
                System.out.print(" *");
            }  
            System.out.println();
        }
    }
}
