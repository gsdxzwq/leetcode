package com.zhaowq.leetcode;

/**
 * Count Binary Substrings
 * <p>
 * Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's,
 * and all the 0's and all the 1's in these substrings are grouped consecutively.
 * Substrings that occur multiple times are counted the number of times they occur.
 * <p>
 * Example 1:
 * Input: "00110011"
 * Output: 6
 * Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's:
 * "0011", "01", "1100", "10", "0011", and "01".
 * Notice that some of these substrings repeat and are counted the number of times they occur.
 * Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
 * <p>
 * Example 2:
 * Input: "10101"
 * Output: 4
 * Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
 *
 * @author zhaowq
 * @date 2018/12/29
 */
public class Solution696 {

    /**
     * 复杂度O(n*n)， 运行提示Time Limit Exceeded
     * 可否有O(n)的解法?
     */
    public int countBinarySubstrings(String s) {
        int count = 0;
        int length = s.length();
        for (int i = 0; i < length - 1; i++) {
            int pre = 1;
            int pos = 0;
            for (int j = i + 1; j < length; j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    if (pos == 0) {
                        pre++;
                    } else {
                        pos++;
                    }
                } else {
                    if (pos == 0) {
                        pos++;
                    } else {
                        break;
                    }
                }
                if (pos == pre) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    /**
     * Solution解法（Group By Character），复杂度O(n)
     */
    public int countBinarySubstrings2(String s) {
        int[] groups = new int[s.length()];
        int t = 0;
        groups[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                groups[++t] = 1;
            } else {
                groups[t]++;
            }
        }

        int ans = 0;
        for (int i = 1; i <= t; i++) {
            ans += Math.min(groups[i - 1], groups[i]);
        }
        return ans;
    }
}
