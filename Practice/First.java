// package Practice;

public class First {
    static void pattern(int num) {
        for (int i = 1; i <= num; i++) {
            if(i==1 || i==num){
                for (int j = 0; j < num; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                int n = num-i;
                for (int j = 0; j < n; j++){
                    System.out.print("  ");
                }
                System.out.println("* ");
            }
        }
    }

    public static void main(String[] a) {
        pattern(20);
    }
}