package String;

import java.util.*;

public class SubStringWithConcatenation {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        HashMap<String, Boolean> combinations = new HashMap<>();
        generatePermutations(words, 0, combinations, s);
        for (Map.Entry<String, Boolean> entry : combinations.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            if (entry.getValue()) {
                while (s.contains(entry.getKey())) {
                    result.add(s.indexOf(entry.getKey()));
                    s = s.substring(0, s.indexOf(entry.getKey()))
                            + s.substring((s.indexOf(entry.getKey()) + (entry.getKey()).length()));
                }

            }
        }
        return result;
    }

    public static void generatePermutations(String[] arr, int index, HashMap<String, Boolean> combinations,
            String str) {
        if (index == arr.length - 1) {
            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                sb.append(s);
            }
            if (str.contains(sb.toString()))
                combinations.put(sb.toString(), true);
            else
                combinations.put(sb.toString(), false);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generatePermutations(arr, index + 1, combinations, str);
            swap(arr, index, i);
        }
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String words[] = { "foo", "bar" };
        System.out.println(findSubstring(s, words));
    }
}
