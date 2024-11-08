package Practice.Arrayyy;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> bigList = new ArrayList<>();
        List<Integer> smallList = new ArrayList<>();
        helper(0, candidates, target, smallList, bigList);
        return bigList;
    }

    public static void helper(int index, int candidates[], int target, List<Integer> smallList,
            List<List<Integer>> bigList) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            bigList.add(new ArrayList<Integer>(smallList));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            smallList.add(candidates[i]);
            helper(i, candidates, target - candidates[i], smallList, bigList);
            smallList.remove(smallList.size() - 1);
        }
    }

    public static void main(String[] args) {

    }
}
