package com.zhaowq.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Contains Duplicate
 * <p>
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: [1,2,3,1]
 * Output: true
 * <p>
 * Example 2:
 * Input: [1,2,3,4]
 * Output: false
 * <p>
 * Example 3:
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 * @author zhaowq
 * @date 2019/1/15
 */
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
