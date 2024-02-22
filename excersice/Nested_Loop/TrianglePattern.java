package excersice.Nested_Loop;

public class TrianglePattern {
    public static void main(String[] args) {
        int range = 5;
        int space = range-1;
        for(int row=1;row<=range;row++){
            for(int i =1;i<=space;i++ ){
                System.out.print(" ");
            }
            space --;
            for(int star=1;star<=row;star++){
                System.out.print("*");
            }
            System.err.println();
    }
    }
}
