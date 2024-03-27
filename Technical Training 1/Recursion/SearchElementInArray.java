package Recursion;

public class SearchElementInArray {
    
    static int[] countElement(int arr[],int index,int search, int count){
        if(index == arr.length){
            int array[] = new int[count];
            return array;
        }
        if(arr[index]==search){
            count += 1;
        }
        int array[] = countElement(arr, index+1, search,count);
        if(arr[index]==search){
            array[count-1] = index;
        }
        return array;
    }

    static int[] findAll(int arr[],int index,int search){
        return countElement(arr, index, search, 0);        
    }
    // static int countElement(int arr[],int index,int search, int count){
    //     if(index == arr.length){
    //         return count;
    //     }
    //     if(arr[index]==search){
    //         count += 1;
    //     }
    //     return countElement(arr, index+1, search,count);
    // }

    // static int[] findAll(int arr[],int index,int search){
    //     if(index==arr.length){
    //         int array[] = new int[countElement(arr, 0, search, 0)];
    //         return array;
    //     }
    //     int array[] = findAll(arr, index+1, search);
    //     if(arr[index]==search){
    //         array[countElement(arr, 0, search, 0)-1]=index;
    //     }
    //     return array;
    // }
    
    public static void main(String[] args) {
        int arr[] = {10,20,50,100,50,90,50,200};
        int search = 50;
        int index = 0;
        int result[] = findAll(arr, index, search);
        for(int r: result){
            System.out.println(r);
        }
    }
}
