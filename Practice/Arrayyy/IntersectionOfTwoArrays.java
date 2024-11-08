package Practice.Arrayyy;

import java.util.*;
// import java.util.LinkedHashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int a : nums1) {
            set1.add(a);
        }
        for (int a : nums2) {
            set2.add(a);
        }
        set1.retainAll(set2);
        System.out.println(set1);
        int arr[] = new int[set1.size()];
        Iterator<Integer> it = set1.iterator();
        int i = 0;
        while(it.hasNext()) {
            arr[i] = it.next();
            i++;
         }
        return arr;
    }
}

public class IntersectionOfTwoArrays {

}
