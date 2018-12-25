package com.zhaowq.leetcode;

/**
 * Monotonic Array
 * <p>
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 * An array A is monotone increasing if for all i <= j, A[i] <= A[j].
 * An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
 * Return true if and only if the given array A is monotonic.
 * <p>
 * Example 1:
 * Input: [1,2,2,3]
 * Output: true
 * <p>
 * Example 2:
 * Input: [6,5,4,4]
 * Output: true
 * <p>
 * Example 3:
 * Input: [1,3,2]
 * Output: false
 * <p>
 * Example 4:
 * Input: [1,2,4,5]
 * Output: true
 * <p>
 * Example 5:
 * Input: [1,1,1]
 * Output: true
 *
 * @author zhaowq
 * @date 2018/12/24
 */
public class Solution896 {
    public boolean isMonotonic(int[] A) {
        int length = A.length;
        int increasing = 0;
        for (int i = 0; i < length - 1; i++) {
            if (A[i] == A[i + 1]) {
                i++;
                continue;
            }

            //确定单调性
            if (increasing == 0) {
                if (A[i] < A[i + 1]) {
                    increasing = 1;
                } else {
                    increasing = -1;
                }
                continue;
            }

            //判断
            if (A[i] < A[i + 1] && increasing == -1) {
                return false;
            }
            if (A[i] > A[i + 1] && increasing == 1) {
                return false;
            }
        }
        return true;
    }
}
