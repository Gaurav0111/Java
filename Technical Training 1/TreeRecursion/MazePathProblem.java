package TreeRecursion;

public class MazePathProblem {

    static void mazePath(int row, int col, int maxV, int maxH, String result){
        if(row==maxH-1 && col == maxV-1){
            System.out.println(result);
            return;
        }
        if(row == maxH || col == maxV){
            return;
        }
        mazePath(row, col+1, maxV, maxH, result+"H");
        mazePath(row+1, col, maxV, maxH, result+"V");
    }

    public static void main(String[] args) {
        mazePath(0, 0, 3, 3, "");
    }
}
