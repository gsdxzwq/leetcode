package com.zhaowq.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Single Number
 * <p>
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 * <p>
 * Example 2:
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 * @author zhaowq
 * @date 2018/12/14
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }

    /**
     * 若要线性时间复杂度，又不申请额外空间，参考discuss用XOR运算。
     * PS：result算不算额外空间
     */
    public int singleNumber2(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
