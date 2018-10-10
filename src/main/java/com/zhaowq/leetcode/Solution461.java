package com.zhaowq.leetcode;

/**
 * Hamming Distance
 * <p>
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * <p>
 * Given two integers x and y, calculate the Hamming distance.
 * <p>
 * Note:
 * 0 ≤ x, y < 2^31.
 * <p>
 * Example:
 * Input: x = 1, y = 4
 * Output: 2
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * <p>
 * The above arrows point to positions where the corresponding bits are different.
 *
 * @author zhaowq
 * @date 2018/10/9
 */
public class Solution461 {
    /**
     * 解法二：看评论可以用Integer.bitCount(x^y)直接得出答案
     */
    public int hammingDistance(int x, int y) {
        int dist = 0;
        int val = x ^ y;
        while (val != 0) {
            dist++;
            val &= val - 1;
        }
        return dist;
    }
}
