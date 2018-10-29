package com.zhaowq.leetcode;

/**
 * Sort Array By Parity II
 * <p>
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 * You may return any answer array that satisfies this condition.
 * <p>
 * Example 1:
 * Input: [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 * <p>
 * Note:
 * 1. 2 <= A.length <= 20000
 * 2. A.length % 2 == 0
 * 3. 0 <= A[i] <= 1000
 *
 * @author zhaowq
 * @date 2018/10/23
 */
public class Solution922 {
    public int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        int i = 0;
        int j = 0;
        for (int a : A) {
            if (a % 2 == 0) {
                result[2 * i++] = a;
            } else {
                result[2 * (j++) + 1] = a;
            }
        }
        return result;
    }
}
