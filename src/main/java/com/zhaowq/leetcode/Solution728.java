package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Self Dividing Numbers
 * <p>
 * A self-dividing number is a number that is divisible by every digit it contains.
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * <p>
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 * <p>
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 *
 * @author zhaowq
 * @date 2018/10/18
 */
public class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        mark:
        for (int i = left; i <= right; i++) {
            int num = i;
            while (num != 0) {
                int digit = num % 10;
                if (digit == 0 || i % digit != 0) {
                    continue mark;
                }
                num = num / 10;
            }
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution728 solution728 = new Solution728();
        System.out.println(solution728.selfDividingNumbers(1, 22));
    }
}
