package com.zhaowq.leetcode;

import java.util.*;

/**
 * Intersection of Two Arrays
 * <p>
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * <p>
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * <p>
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 *
 * @author zhaowq
 * @date 2019/1/4
 */
public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    set.add(num1);
                    break;
                }
            }
        }

        int[] result = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            result[i] = iterator.next();
        }

        return result;
    }
}
