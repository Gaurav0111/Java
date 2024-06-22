package TwoDArray;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int length = 0;
        // int matrix[][] = { { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 },
        // { 13, 14, 15, 16 } };
        int matrix[][] = { { 1 }, { 2 }, { 3 } };
        for (int val[] : matrix) {
            length += val.length;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= matrix.length / 2; i++) {
            // first row
            for (int j = i; j < matrix[i].length - i; j++) {
                System.out.print(matrix[i][j] + "->");
                // System.out.print("first row ");
            }
            if(list.size()==length){
                return;
            }
            // return ;
            // last column
            for (int j = i + 1; j < matrix.length - i; j++) {
                System.out.print(matrix[j][matrix[j].length - i - 1] + "->");
                // System.out.print("last column ");
            }
            if(list.size()==length){
                return;
            }
            // return;
            // last row
            int lastRow = matrix.length - 1 - i;
            for (int j = matrix.length - i - 1; j >= i + 1; j--) {
                // System.out.print(matrix[lastRow][matrix[lastRow].length-j]+"->");
                System.out.print("last row ");
                System.out.print(matrix[lastRow][j - 1] + "->");
            }
            if(list.size()==length){
                return;
            }
            // return;
            // first column
            for (int j = i + 1; j < lastRow; j++) {
                System.out.print(matrix[lastRow - j][i] + "->");
                // System.out.print("first column ");
            }
            if(list.size()==length){
                return;
            }
            // return;
        }
        // return list;
        System.out.println(list);
    }
}
