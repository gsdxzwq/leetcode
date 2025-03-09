package com.zhaowq.leetcode;

/**
 * @author zhaowq
 * @date 2024/11/26
 */
public class Solution3206 {
    public int numberOfAlternatingGroups(int[] colors) {
        int res = 0;
        for (int i = 0; i < colors.length; i++) {
            int pre = i - 1;
            if (pre == -1) {
                pre = colors.length - 1;
            }
            int next = i + 1;
            if (next == colors.length) {
                next = 0;
            }
            if (colors[i] != colors[pre] && colors[i] != colors[next]) {
                res++;
            }
        }
        return res;
    }
}
