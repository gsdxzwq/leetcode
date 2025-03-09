package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaowq
 * @date 2024/11/28
 */
public class Solution3033 {
    public int[][] modifiedMatrix(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            int max = matrix[0][j];
            List<Integer> items = new ArrayList<>();
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if (matrix[i][j] == -1) {
                    items.add(i);
                }
            }
            for (int item : items) {
                matrix[item][j] = max;
            }
        }
        return matrix;
    }
}
