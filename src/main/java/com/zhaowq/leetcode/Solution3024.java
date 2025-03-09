package com.zhaowq.leetcode;

import java.util.Arrays;

/**
 * @author zhaowq
 * @date 2024/11/28
 */
public class Solution3024 {
    public String triangleType(int[] nums) {
        if (nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]) {
            Arrays.sort(nums);
            if (nums[0] != nums[1]) {
                if (nums[0] != nums[2] && nums[1] != nums[2]) {
                    return "scalene";
                } else {
                    return "isosceles";
                }
            } else {
                if (nums[0] == nums[2]) {
                    return "equilateral";
                } else {
                    return "isosceles";
                }
            }
        }
        return "none";
    }
}
