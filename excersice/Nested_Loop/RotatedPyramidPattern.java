package excersice.Nested_Loop;

public class RotatedPyramidPattern {
    public static void main(String[] args) {
        int num = 10;
        for (int row = 1; row <= num / 2; row++) {
            for (int i = 1; i <=row; i++) {
                System.err.print("*");
            }
            System.out.println();
        }
        for(int row =4;row>=0;row--){
            for (int i = 0; i <=row; i++) {
                System.err.print("*");
            }
            System.out.println();
        }
    }
}
