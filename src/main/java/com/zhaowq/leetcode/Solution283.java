package com.zhaowq.leetcode;

/**
 * Move Zeroes
 * <p>
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Example:
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * <p>
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 * @author zhaowq
 * @date 2018/12/25
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int point = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[point++] = nums[i];
            }
        }

        for (int i = point; i < length; i++) {
            nums[i] = 0;
        }
    }
}
