package Week_01;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length -1; i >= 0; i--) {
            if (++digits[i] < 10) {
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{1,2,3};
        System.out.println(Arrays.toString(new PlusOne().plusOne(digits)));

        digits = new int[]{8,9,9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(digits)));

        digits = new int[]{9,9,9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(digits)));
    }
}
