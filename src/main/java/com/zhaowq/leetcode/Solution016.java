package com.zhaowq.leetcode;

import java.util.Arrays;

/**
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 * <p>
 * Return the sum of the three integers.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 *
 *
 * Example 1:
 * <p>
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * Example 2:
 * <p>
 * Input: nums = [0,0,0], target = 1
 * Output: 0
 * Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 *
 * @author zhaowq
 * @date 2024/9/19
 */
public class Solution016 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length - 3; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int num = nums[i]+nums[left] + nums[right];

                if (Math.abs(num - target) < Math.abs(res - target)) {
                    res = num;
                }

                if (num < target) {
                    left++;
                } else if(num > target) {
                    right--;
                } else {
                    break;
                }
            }
        }
        return res;
    }
}
