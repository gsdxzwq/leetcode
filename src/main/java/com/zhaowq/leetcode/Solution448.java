package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Find All Numbers Disappeared in an Array
 * <p>
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime?
 * You may assume the returned list does not count as extra space.
 * <p>
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 * Output:
 * [5,6]
 *
 * @author zhaowq
 * @date 2018/12/26
 */
public class Solution448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }
}
