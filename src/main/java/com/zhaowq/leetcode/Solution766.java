package com.zhaowq.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
 * <p>
 * Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
 *
 * @author zhaowq
 * @date 2018/12/12
 */
public class Solution766 {

    /**
     * 思路：同一对角线上的元素，横坐标与纵坐标的差为定值。
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        if (row < 2 || column < 2) {
            return true;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (map.containsKey(i - j)) {
                    if (matrix[i][j] != map.get(i - j)) {
                        return false;
                    }
                } else {
                    map.put(i - j, matrix[i][j]);
                }
            }
        }
        return true;
    }

    /**
     * 参考discuss，优化了空间复杂度，遍历时直接与右下（或左上）元素比较
     */
    public boolean isToeplitzMatrix2(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
