package com.zhaowq.leetcode;

import java.util.Arrays;

/**
 * Array Partition I
 * <p>
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1),
 * (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 * <p>
 * Example 1:
 * Input: [1,4,3,2]
 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 *
 * @author zhaowq
 * @date 2018/10/17
 */
public class Solution561 {
    /**
     * 该方案需要经过证明，参考discuss
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }

    /**
     * 仍然利用了以上结论，只是把排序从Arrays工具类改为for循环
     * @param nums
     * @return
     */
    public int arrayPairSum2(int[] nums) {
        int[] exist = new int[20001];
        for (int num : nums) {
            exist[num + 10000]++;
        }
        int sum = 0;
        boolean odd = true;
        for (int i = 0; i < exist.length; i++) {
            while (exist[i]-- > 0) {
                if (odd) {
                    sum += i;
                }
                odd = !odd;
                //exist[i]--;
            }
        }
        return sum - (5000 * nums.length);
    }
}
