package Practice.String;

public class OnePlus {
    public static int[] plusOne(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[digits.length - i] < 9) {
                digits[digits.length - i] = digits[digits.length - i] + 1;
                break;
            } else {
                digits[digits.length - i] = 0;
            }
        }

        return digits;
    }

    public static void main(String[] args) {
        // int[] digits = {4,3,2,1};
        int[] digits = {4};
        int[] result = plusOne(digits);
        for(int i:result){
            System.out.println(i+" ");
        }
    }
}


// public class OnePlus {
//     public static int[] plusOne(int[] digits) {
//         for (int i = digits.length - 1; i >= 0; i--) {
//             if (digits[i] < 9) {
//                 digits[i] += 1;
//                 return digits;  // Return immediately if no carry is needed
//             }
//             digits[i] = 0;  // Set current digit to 0 if it's 9
//         }

//         // If all digits were 9, we need a new array with an extra digit
//         int[] newDigits = new int[digits.length + 1];
//         newDigits[0] = 1;  // First digit is 1, all others default to 0
//         return newDigits;
//     }

//     public static void main(String[] args) {
//         int[] digits = {9, 9, 9};  // Test with an edge case
//         int[] result = plusOne(digits);
//         for (int i : result) {
//             System.out.print(i + " ");
//         }
//     }
// }
