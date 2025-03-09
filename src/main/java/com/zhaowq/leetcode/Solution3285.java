package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaowq
 * @date 2024/12/23
 */
public class Solution3285 {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            if (height[i] != 0 && height[i - 1] > threshold) {
                res.add(i);
            }
        }
        return res;
    }
}
