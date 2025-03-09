package com.zhaowq.leetcode;

import java.util.Arrays;

/**
 * Medium
 *
 * @author zhaowq
 * @date 2024/12/19
 */
public class Solution238 {
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        // 先计算当前位置左边元素的乘积，初始第一个位置左边乘积为1
        int leftProduct = 1;
        for (int i = 0; i < length; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }
        // 再计算当前位置右边元素的乘积，并与之前左边的乘积相乘得到最终结果
        int rightProduct = 1;
        for (int i = length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] output = productExceptSelf(nums);
        System.out.println(Arrays.toString(output));
    }
}
