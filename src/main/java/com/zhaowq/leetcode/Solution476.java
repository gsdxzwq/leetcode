package com.zhaowq.leetcode;

/**
 * Number Complement
 * <p>
 * Given a positive integer, output its complement number.
 * The complement strategy is to flip the bits of its binary representation.
 * <p>
 * Note:
 * a.The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 * b.You could assume no leading zero bit in the integer’s binary representation.
 * <p>
 * Example 1:
 * Input: 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 * <p>
 * Example 2:
 * Input: 1
 * Output: 0
 * Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 *
 * @author zhaowq
 * @date 2018/12/5
 */
public class Solution476 {

    /**
     * 按正常思路推导
     */
    public static int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (char c : binary.toCharArray()) {
            sb.append(c == '0' ? "1" : "0");
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(3));
        System.out.println(findComplement(5));
    }
}
