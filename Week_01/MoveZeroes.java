package Week_01;

import java.util.Arrays;

class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] test = new int[]{0,1,0,3,12};
        new MoveZeroes().moveZeroes(test);
        System.out.println(Arrays.toString(test));
    }
}

