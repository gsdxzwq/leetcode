package com.zhaowq.leetcode;

/**
 * @author zhaowq
 * @date 2024/9/14
 */
public class Solution2390 {
    public static String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '*') {
                res.append(c);
            } else {
                res.deleteCharAt(res.length());
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
}
