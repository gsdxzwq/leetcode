package com.zhaowq.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaowq
 * @date 2024/9/19
 */
public class Solution070 {
    private static Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int value = climbStairs(n - 1) + climbStairs(n - 2);
        map.put(n, value);
        return value;
    }
}
