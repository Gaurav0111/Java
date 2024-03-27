package Recursion;

public class ArrayRecursion {

    static boolean inSorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return inSorted(arr, index+1);
    }

    public static void main(String[] args) {
        
    int arr[] = {12,23,12,23,123,134123,1};
    System.out.println(inSorted(arr, 0));
}
    
}
