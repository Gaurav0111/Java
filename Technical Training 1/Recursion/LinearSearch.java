package Recursion;

public class LinearSearch {

    static boolean isFound(int arr[],int index,int search){
        if(index == arr.length){
            return false;
        }
        if(arr[index]==search){
            return true;
        }
        return isFound(arr, index+1, search);
    } 

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int search = 5;
        int index = 0;
        System.out.println(isFound(arr, index, search)?"Found":"Not Found");
    }
}
