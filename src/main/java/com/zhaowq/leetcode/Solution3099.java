package com.zhaowq.leetcode;

/**
 * @author zhaowq
 * @date 2024/11/25
 */
public class Solution3099 {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        String str = Integer.toString(x);
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        if (x % sum == 0) {
            return sum;
        } else {
            return -1;
        }
    }
}
