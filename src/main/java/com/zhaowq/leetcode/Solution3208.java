package com.zhaowq.leetcode;

/**
 * Medium
 *
 * @author zhaowq
 * @date 2024/12/19
 */
public class Solution3208 {
    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int length = colors.length;
        int res = length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < i + k - 1; j++) {
                if (colors[(j + length) % length] == colors[(j + length + 1) % length]) {
                    res--;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numberOfAlternatingGroups(new int[]{0, 1, 0, 1, 0}, 3));
        System.out.println(3%7);
    }
}
