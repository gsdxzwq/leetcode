package com.zhaowq.leetcode;

import java.util.HashMap;

/**
 * Two Sum
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 *
 * @author zhaowq
 * @date 2016/1/3
 */
public class Solution001 {

    /**
     * 暴力解法
     */
    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    results[0] = i;
                    results[1] = j;
                }
            }
        }
        return results;
    }

    /**
     * 时间复杂度为O(n)
     */
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                result[0] = index + 1;
                result[1] = i + 1;
                break;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
}
