package Recursion;

public class Recursion {

    static void show(int n){
        // show(n-1); //HeadRecursion
        if (n == 0) {
            return ;
        }
        System.out.println("Gaurav");
        show(n-1);
        System.out.println("Garwal");
        // show(n-1); //TailRecursion
    }
    public static void main(String[] args) {
        show(5);   
    }
}
