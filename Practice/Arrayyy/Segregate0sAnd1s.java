package Practice.Arrayyy;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        int n = 5;
        // int arr[] = { 1, 0, 1, 1, 0 };
        int arr[] = { 2, 1, 0, 2, 2, 1, 0, 0, 2 };
        // int arr[] = {1,1,1,1};
        // int arr[] = {0,0,0,0};
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
