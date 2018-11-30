package com.zhaowq.leetcode;

/**
 * Transpose Matrix
 * <p>
 * Given a matrix A, return the transpose of A.
 * <p>
 * The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.
 * <p>
 * Example 1:
 * Input: [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[1,4,7],[2,5,8],[3,6,9]]
 * <p>
 * Example 2:
 * Input: [[1,2,3],[4,5,6]]
 * Output: [[1,4],[2,5],[3,6]]
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 1000
 * 1 <= A[0].length <= 1000
 *
 * @author zhaowq
 * @date 2018/10/30
 */
public class Solution867 {
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int column = A[0].length;
        int[][] tran = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                tran[j][i] = A[i][j];
            }
        }
        return tran;
    }
}
