package com.zhaowq.leetcode;

/**
 * Reverse Words in a String
 * <p>
 * Given an input string, reverse the string word by word.
 * <p>
 * Example:
 * Input: "the sky is blue",
 * Output: "blue is sky the".
 * <p>
 * Note:
 * a.A word is defined as a sequence of non-space characters.
 * b.Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
 * c.You need to reduce multiple spaces between two words to a single space in the reversed string.
 * <p>
 * Follow up: For C programmers, try to solve it in-place in O(1) space.
 *
 * @author zhaowq
 * @date 2018/12/4
 */
public class Solution151 {
    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        String[] arrays = s.split(" ");
        for (int i = arrays.length - 1; i >= 0; i--) {
            if (!"".equals(arrays[i])) {
                sb.append(arrays[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
