package com.zhaowq.leetcode;

/**
 * Shortest Distance to a Character
 * <p>
 * Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.
 * <p>
 * Example 1:
 * Input: S = "loveleetcode", C = 'e'
 * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 *
 * @author zhaowq
 * @date 2018/12/6
 */
public class Solution821 {
    public static int[] shortestToChar(String S, char C) {
        char[] chars = S.toCharArray();
        int[] result = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i - j >= 0 && i - j < chars.length && C == chars[i - j]) {
                    result[i] = j;
                    break;
                }
                if (i + j >= 0 && i + j < chars.length && C == chars[i + j]) {
                    result[i] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(shortestToChar("aaba", 'b'));
    }
}
