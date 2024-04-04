package TreeRecursion;

public class TreeRecursion1 {
    static void tree(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println("Pre: " + num);
        tree(num - 1);
        System.out.println("In Between: " + num);
        tree(num - 2);
        System.out.println("Post: " + num);
    }

    public static void main(String[] args) {
        tree(3);
    }
}