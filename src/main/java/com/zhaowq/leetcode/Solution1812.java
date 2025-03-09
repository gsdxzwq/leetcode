package com.zhaowq.leetcode;

/**
 * @author zhaowq
 * @date 2024/12/9
 */
public class Solution1812 {
    public static boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0) - coordinates.charAt(1)) % 2 != 0;
    }

    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1"));
        System.out.println(squareIsWhite("h3"));
        System.out.println(squareIsWhite("c7"));
    }
}
