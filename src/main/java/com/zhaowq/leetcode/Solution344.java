package com.zhaowq.leetcode;

/**
 * Reverse String
 * <p>
 * Write a function that takes a string as input and returns the string reversed.
 * <p>
 * Example 1:
 * Input: "hello"
 * Output: "olleh"
 * <p>
 * Example 2:
 * Input: "A man, a plan, a canal: Panama"
 * Output: "amanaP :lanac a ,nalp a ,nam A"
 *
 * @author zhaowq
 * @date 2018/12/5
 */
public class Solution344 {
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
