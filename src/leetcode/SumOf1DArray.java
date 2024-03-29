package leetcode;

import java.util.Arrays;

public class SumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    /**
     * @param nums 1D array
     * @return sums of 1D array
     */
    static int[] runningSum(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
