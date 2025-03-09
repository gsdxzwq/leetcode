package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaowq
 * @date 2024/12/20
 */
public class Solution2970 {
    public int incremovableSubarrayCount(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (check(nums, i, j)) {
                    res++;
                }
            }
        }
        return res;
    }

    private static boolean check(int[] nums, int m, int n) {
        List<Integer> temps = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i < m || i > n) {
                temps.add(nums[i]);
            }
        }
        if (temps.size() > 1) {
            for (int i = 0; i < temps.size() - 1; i++) {
                if (temps.get(i) >= temps.get(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }
}
