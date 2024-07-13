package Array;

import java.util.Collections;

public class ContainerWithMostWater {
    public static int[] maxHeight(int[] height) {
        int arr[] = new int[2];
        for (int i = 0; i < height.length; i++) {
            if (height[i] > arr[0]) {
                arr[0] = height[i];
                arr[1] = i;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
        return arr;
    }

    // public static int maxArea(int[] height) {
    // int maxAre = 0;
    // int currentArea=0;
    // int index = maxHeight(height)[1];
    // for (int i = 0; i < height.length; i++) {
    // currentArea = (height[i] * Math.abs(index - i));
    // maxAre = Math.max(maxAre, currentArea);
    // }
    // return maxAre;
    // }
    public static int maxArea(int[] height) {
        int maxAre = 0;
        int currentArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                if (i == j)
                    continue;
                currentArea = Math.min(height[i], height[j]) * Math.abs(i - j);
                maxAre = Math.max(currentArea, maxAre);
            }
        }
        return maxAre;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        // int arr[] = { 1, 2, 1 };
        int arr[] = { 1, 1};
        System.out.println(maxArea(arr));
    }
}
