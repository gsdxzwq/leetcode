package com.zhaowq.leetcode;

/**
 * @author zhaowq
 * @date 2024/12/24
 */
public class Solution3222 {
    public String winningPlayer(int x, int y) {
        // 1表示Alice,-1表示Bob
        int res = 1;
        do {
            x--;
            y = y - 4;
            res = res * (-1);
        } while (x >= 0 && y >= 0);
        return res == 1 ? "Alice" : "Bob";
    }
}
