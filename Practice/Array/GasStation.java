package Array;

class Solution5 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // int result = -1;
        int i = 0;
        for (; i < gas.length; i++) {
            System.out.println("for: " + i);
            int totalgas = 0;
            int pos = i;
            for (int j = 0; j < gas.length; j++) {
                System.out.println("  pos: " + pos);
                int currentgas = gas[pos];
                totalgas += currentgas;
                pos = (pos + 1) % gas.length;
                int nextCost = cost[pos] - 1;
                if (totalgas < nextCost) {
                    break;
                }
                totalgas -= nextCost;
            }
            System.out.println("  totalgas: " + totalgas);
            if (totalgas >= gas[i] && pos == i) {
                return i;
            }
        }
        return -1;
    }
}

public class GasStation {
    public static void main(String[] args) {
        int gas[] = { 1, 2, 3, 4, 5 };
        int cost[] = { 3, 4, 5, 1, 2 };
        Solution5 sl = new Solution5();
        System.out.println(sl.canCompleteCircuit(gas, cost));
    }
}
