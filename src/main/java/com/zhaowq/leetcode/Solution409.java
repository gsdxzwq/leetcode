package com.zhaowq.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaowq
 * @date 2024/9/19
 */
public class Solution409 {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.compute(c, (k, num) -> num + 1);
            } else {
                map.put(c, 1);
            }
        }
        int res = 0;
        for (char c : map.keySet()) {
            res += map.get(c) / 2 * 2;
            if (map.get(c) % 2 == 1 && res % 2 == 0) {
                res++;
            }
        }
        return res;
    }
}
