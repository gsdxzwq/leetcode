package com.zhaowq.leetcode;

/**
 * @author zhaowq
 * @date 2024/11/18
 */
public class Solution661 {

    public int[][] imageSmoother(int[][] img) {
        int[][] res = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                res[i][j] = smoother(img, i, j);
            }
        }
        return res;
    }

    private int smoother(int[][] img, int i, int j){
        int sum = img[i][j];
        int count = 1;
        if (i-1>=0&&j-1>=0){
            count++;
            sum+=img[i-1][j-1];
        }
        if (i-1>=0){
            count++;
            sum+=img[i-1][j];
        }
        if (i-1>=0&&j+1<img[0].length){
            count++;
            sum+=img[i-1][j+1];
        }

        if (j-1>=0){
            count++;
            sum+=img[i][j-1];
        }
        if (j+1<img[0].length){
            count++;
            sum+=img[i][j+1];
        }

        if (i+1<img.length&&j-1>=0){
            count++;
            sum+=img[i+1][j-1];
        }
        if (i+1<img.length){
            count++;
            sum+=img[i+1][j];
        }
        if (i+1<img.length&&j+1<img[0].length){
            count++;
            sum+=img[i+1][j+1];
        }
        return sum/count;
    }
}
