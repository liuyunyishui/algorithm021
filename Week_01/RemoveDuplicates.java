package Week_01;

import java.util.Arrays;

public class RemoveDuplicates {
    
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int j = 0;
        for (int i = 1; i <= nums.length -1; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            } 
        }
        return j + 1;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,3};
        nums = Arrays.copyOf(nums, new RemoveDuplicates().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
