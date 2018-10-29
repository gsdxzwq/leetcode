package com.zhaowq.leetcode;

/**
 * Peak Index in a Mountain Array
 * <p>
 * Let's call an array A a mountain if the following properties hold:
 * A.length >= 3
 * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * <p>
 * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
 * <p>
 * Example 1:
 * Input: [0,1,0]
 * Output: 1
 * <p>
 * Example 2:
 * Input: [0,2,1,0]
 * Output: 1
 * <p>
 * Note:
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 * A is a mountain, as defined above.
 *
 * @author zhaowq
 * @date 2018/10/22
 */
public class Solution852 {
    /**
     * 最先想到的是二分查找，看discuss发现还有更优的黄金分割搜索
     */
    public int peakIndexInMountainArray(int[] A) {
        int low = 0, high = A.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (A[mid] < A[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
