package com.zhaowq.leetcode;

/**
 * Longest Substring Without Repeating Characters
 * <p>
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * @author zhaowq
 * @date 2016/1/5
 */
public class Solution003 {
    public int lengthOfLongestSubstring(String s) {
        // current start point of substring without dup
        int start = 0;
        // max length of substring found
        int maxLen = 0;
        // hash table for index of each char appeared
        int[] table = new int[256];
        for (int i = 0; i < table.length; i++) {
            // if char not present, index is -1
            table[i] = -1;
        }
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (table[s.charAt(i)] != -1) {
                while (start <= table[s.charAt(i)]) {
                    table[s.charAt(start++)] = -1;
                }
            }
            if (i - start + 1 > maxLen) {
                maxLen = i - start + 1;
            }
            table[s.charAt(i)] = i;
        }
        return maxLen;
    }
}
