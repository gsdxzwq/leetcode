package com.zhaowq.leetcode;

import java.util.Arrays;

/**
 * Reverse Words in a String III
 * <p>
 * Given a string, you need to reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 * <p>
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 *
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 *
 * @author zhaowq
 * @date 2018/12/4
 */
public class Solution557 {
    public String reverseWords(String s) {
        if (null== s){
            return null;
        }

        String[] arrays = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String arr : arrays){
            sb.append(new StringBuffer(arr).reverse().toString()).append(" ");
        }

        return sb.toString().trim();
    }
}
