package com.zhaowq.leetcode;

import java.util.Arrays;

/**
 * @author zhaowq
 * @date 2019/1/9
 */
public class Solution242 {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        return Arrays.equals(ss, tt);
    }
}
