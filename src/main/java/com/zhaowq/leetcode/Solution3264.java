package com.zhaowq.leetcode;

import java.util.Arrays;

/**
 * @author zhaowq
 * @date 2024/12/13
 */
public class Solution3264 {
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int min_location = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[min_location]) {
                    min_location = j;
                }
            }
            System.out.println(min_location);
            System.out.println(Arrays.toString(nums));

            nums[min_location] = nums[min_location] * multiplier;
            System.out.println(Arrays.toString(nums));
        }
        return nums;
    }

    public static void main(String[] args) {
        //nums = [2,1,3,5,6], k = 5, multiplier = 2
        getFinalState(new int[]{2,1,3,5,6}, 5, 2);
    }
}
