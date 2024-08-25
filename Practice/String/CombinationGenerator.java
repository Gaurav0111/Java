package String;

import java.util.HashMap;
import java.util.Map;

public class CombinationGenerator {

    public static void main(String[] args) {
        String[] arr = { "A", "B", "C" };
        HashMap<String, Boolean> combinations = new HashMap<>();

        generatePermutations(arr, 0, combinations);

        for (Map.Entry<String, Boolean> entry : combinations.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void generatePermutations(String[] arr, int index, HashMap<String, Boolean> combinations) {
        if (index == arr.length - 1) {
            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                sb.append(s);
            }
            combinations.put(sb.toString(), true);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generatePermutations(arr, index + 1, combinations);
            swap(arr, index, i);
        }
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}