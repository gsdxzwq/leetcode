package com.zhaowq.leetcode;

/**
 * DI String Match
 * <p>
 * Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
 * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
 * <p>
 * If S[i] == "I", then A[i] < A[i+1]
 * If S[i] == "D", then A[i] > A[i+1]
 * <p>
 * Example 1:
 * Input: "IDID"
 * Output: [0,4,1,3,2]
 * <p>
 * Example 2:
 * Input: "III"
 * Output: [0,1,2,3]
 * <p>
 * Example 3:
 * <p>
 * Input: "DDI"
 * Output: [3,2,0,1]
 * <p>
 * Note:
 * <p>
 * 1 <= S.length <= 10000
 * S only contains characters "I" or "D".
 *
 * @author zhaowq
 * @date 2018/11/30
 */
public class Solution942 {
    public int[] diStringMatch(String S) {
        char[] chars = S.toCharArray();
        int N = S.length();
        int[] result = new int[N + 1];

        int m = 0;
        int n = N;
        for (int i = 0; i < N; i++) {
            if ('I' == chars[i]) {
                result[i] = m++;
            } else {
                result[i] = n--;
            }
        }
        result[N] = m;
        return result;
    }
}
