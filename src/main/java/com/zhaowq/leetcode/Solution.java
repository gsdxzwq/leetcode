package com.zhaowq.leetcode;

import java.util.Scanner;

/**
 * 历史久远，看不出来哪一题
 *
 * @author zhaowq
 * @date 2015/6/3
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        in.nextLine();
        int[] num = new int[s];
        for (int m = 0; m < s; m++) {
            num[m] = in.nextInt();
        }
        in.nextLine();

        for (int n = 0; n < t; n++) {
            int i = in.nextInt();
            int j = in.nextInt();
            int res = minServiceLane(i, j, num);
            System.out.println(res);
            in.nextLine();
        }
    }

    private static int minServiceLane(int a, int b, int s[]) {
        int result = s[a];
        for (int k = a; k < b; k++) {
            if (s[k] > s[k + 1]) {
                result = s[k + 1];
            }
        }
        return result;
    }
}

