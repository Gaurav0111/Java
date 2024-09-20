package Array;

public class MergeInterval {
    public static int[][] merge(int[][] intervals) {
        
        return intervals;
    }

    public static void main(String[] args) {
        int intervals[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int resuult[][] = merge(intervals);
        for (int i = 0; i < resuult.length; i++) {
            System.out.print('[');
            for (int j = 0; j < resuult[i].length; j++) {
                System.out.print(resuult[i][j]+" ,");
            }
            System.out.println(']');
        }
    }
}
