package com.zhaowq.leetcode;

/**
 * Projection Area of 3D Shapes
 *
 * On a N * N grid, we place some 1 * 1 * 1 cubes that are axis-aligned with the x, y, and z axes.
 * <p>
 * Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
 * <p>
 * Now we view the projection of these cubes onto the xy, yz, and zx planes.
 * <p>
 * A projection is like a shadow, that maps our 3 dimensional figure to a 2 dimensional plane.
 * <p>
 * Here, we are viewing the "shadow" when looking at the cubes from the top, the front, and the side.
 * <p>
 * Return the total area of all three projections.
 *
 * @author zhaowq
 * @date 2018/10/24
 */
public class Solution883 {
    public int projectionArea(int[][] grid) {
        int N = grid.length;
        int ans = 0;

        for (int i = 0; i < N;  ++i) {
            int bestRow = 0;  // largest of grid[i][j]
            int bestCol = 0;  // largest of grid[j][i]
            for (int j = 0; j < N; ++j) {
                if (grid[i][j] > 0) ans++;  // top shadow
                bestRow = Math.max(bestRow, grid[i][j]);
                bestCol = Math.max(bestCol, grid[j][i]);
            }
            ans += bestRow + bestCol;
        }

        return ans;
    }
}
