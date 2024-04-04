package Recursion.Pattern;

public class BasicPattern {

    static void printLine(int numofLine){
        if(numofLine == 0){
            return ;
        }
        printLine(numofLine-1);
        printStar(numofLine);
        System.out.println();
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
