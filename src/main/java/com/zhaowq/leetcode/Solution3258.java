package com.zhaowq.leetcode;

/**
 * @author zhaowq
 * @date 2024/11/13
 */
public class Solution3258 {
    public int countKConstraintSubstrings(String s, int k) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int zero = 0;
            int one = 0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == 0) {
                    zero += 1;
                } else {
                    one += 1;
                }
                if (zero <= k || one <= k) {
                    sum++;
                } else {
                    break;
                }
            }
        }
        return sum;
    }
}
