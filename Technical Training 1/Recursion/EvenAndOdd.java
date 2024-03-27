package Recursion;

public class EvenAndOdd {

    static int[] countEvenOdd(int range){
        if(range==0){
            int array[]=new int[2];         
            return array;
        }
        int array[] = countEvenOdd(range-1); //Small Problem
        if(range%2 == 0){
            array[1] += 1;  // even count
        }
        else{
            array[0] += 1; //odd count
        }
        return array;
    }

    static void countEvenOdd(int range,int oddCount, int evenCount){
        if(range==0){  // base case
            System.out.println("Even: "+evenCount+" Odd: "+oddCount);
            return ;
        }

        if (range%2==0) {
            evenCount ++;
        }
        else{
            oddCount ++;
        }
        countEvenOdd(range-1,oddCount,evenCount);      //small problem
    }
    public static void main(String[] args) {
    int range = 987;
        countEvenOdd(range, 0,0);
        int array[] = countEvenOdd(range);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
