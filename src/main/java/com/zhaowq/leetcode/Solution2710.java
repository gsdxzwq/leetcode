package com.zhaowq.leetcode;

/**
 * @author zhaowq
 * @date 2024/11/20
 */
public class Solution2710 {
    public String removeTrailingZeros(String num) {
        int res = num.length()-1;
        for (int i = num.length() - 1; i > 0; i--) {
            if (num.charAt(i) == '0') {
                res = i;
            } else {
                break;
            }
        }
        return num.substring(0, res);
    }
}
