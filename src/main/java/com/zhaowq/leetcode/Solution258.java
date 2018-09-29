package com.zhaowq.leetcode;

/**
 * Add Digits
 * <p>
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * <p>
 * Example:
 * Input: 38
 * Output: 2
 * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
 * Since 2 has only one digit, return it.
 * <p>
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 *
 * @author zhaowq
 * @date 2018/9/29
 */
public class Solution258 {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        } else {
            return addDigits(num / 10 + num % 10);
        }
    }

    /**
     * Simple Java Solution No recursion/ loop
     * from Discuss
     */
    public int addDigits2(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }
}