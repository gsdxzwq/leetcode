package com.zhaowq.leetcode;

/**
 * @author zhaowq
 * @date 2024/9/19
 */
public class Solution027 {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int point = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
                nums[point++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}
