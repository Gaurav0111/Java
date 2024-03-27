package Recursion;

public class PrintTable {

    static String printTable2(int num,int val){
        if(val==0){
            return "";
        }
        String str =  printTable2(num, val-1);
        str += num + " * " + val + " = " + val*num + "\n" ;
        return str; 
    }

    static void printTable1(int num, int val){
        if(val==0){
            return;
        }
        printTable1(num, val-1);
        System.out.println(num + " * " + val + " = " + val*num);
    }

    static void printTable(int num, int val){
        if(val>10){
            return;
        }
        System.out.println(num + " * " + val + " = " + val*num);
        printTable(num, val+1);
    }
    public static void main(String[] args) {
        printTable(5, 1);
        System.out.println("");
        printTable1(5, 10);
        System.out.println("");
        System.out.println(printTable2(5, 10));
    }
}
