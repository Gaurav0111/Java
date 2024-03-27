package Recursion;

public class PrintArray {

    static void printArray(int arr[],int index){
        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        printArray(arr, index+1);
    }

    public static void main(String[] args) {
        int arr[] = {12,23,21,3242,34,1234,12,3,123};
        printArray(arr, 0);
    }
}
