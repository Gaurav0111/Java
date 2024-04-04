package Recursion.Pattern;

public class ReverseBasicPattern {
    static void printLine(int numofLine){
        if(numofLine == 0){
            return ;
        }
        printStar(numofLine);
        System.out.println();
        printLine(numofLine-1);
    }
    static void printStar(int numofStar){
        if(numofStar == 0 ){
            return;
        }
        System.out.print("*");    
        printStar(numofStar-1);
    }
    public static void main(String[] args) {
        printLine(5);
    }
}
