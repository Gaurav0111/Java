package Practice.Arrayyy;

import java.util.*;

public class MergeInterval {
    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals.length - 1; j++) {
                if (intervals[j][0] > intervals[j + 1][0]) {
                    int temp1 = intervals[j][0];
                    int temp2 = intervals[j][1];
                    intervals[j][0] = intervals[j + 1][0];
                    intervals[j][1] = intervals[j + 1][1];
                    intervals[j + 1][0] = temp1;
                    intervals[j + 1][1] = temp2;
                }
            }
        }
        for (int i = 0; i < intervals.length; i++) {
            if (i == intervals.length-1) {
                list.add(intervals[i]);
            } else if (intervals[i][1] < intervals[i + 1][0]) {
                list.add(intervals[i]);
            } else {
                int temp[] = { intervals[i][0], intervals[i + 1][1] };
                list.add(temp);
                i++;
            }
        }
        int result[][] = new int[list.size()][2];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        System.out.println(list);
        return result;
    }

    public static void main(String[] args) {
        int intervals[][] = { { 1, 3 }, { 2, 6 }, { 15, 18 }, { 8, 10 } };
        int resuult[][] = merge(intervals);
        for (int i = 0; i < resuult.length; i++) {
            System.out.print('[');
            for (int j = 0; j < resuult[i].length; j++) {
                System.out.print(resuult[i][j] + " ,");
            }
            System.out.println(']');
        }
    }
}
