package Array;

public class AlternativeGroup {
    public static int numberOfAlternatingGroups(int[] colors) {
        int result = 0;
        if (colors.length < 3) {
            return result;
        }
        int left = 0;
        int right = 2;
        while (left < colors.length) {
            int middle = (left+right)/2;
            if ((colors[left] == colors[right]) && (colors[right] != colors[middle])) {
                result += 1;
            }
            right = (right + 1) % colors.length;
            left = (left + 1) % colors.length;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 0, 1 };
        System.out.println(numberOfAlternatingGroups(arr));
    }
}
