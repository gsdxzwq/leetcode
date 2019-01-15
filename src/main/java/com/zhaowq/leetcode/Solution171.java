package com.zhaowq.leetcode;

/**
 * Excel Sheet Column Number
 * <p>
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * <p>
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * Example 1:
 * Input: "A"
 * Output: 1
 * <p>
 * Example 2:
 * Input: "AB"
 * Output: 28
 * <p>
 * Example 3:
 * Input: "ZY"
 * Output: 701
 *
 * @author zhaowq
 * @date 2019/1/7
 */
public class Solution171 {
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
