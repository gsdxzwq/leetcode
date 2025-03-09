package com.zhaowq.leetcode;

import java.util.Arrays;

/**
 * Medium
 *
 * @author zhaowq
 * @date 2024/12/19
 */
public class Solution204 {
    //暴力破解
    public static int countPrimes(int n) {
        int res = 0;
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                res++;
            }
        }
        return res;
    }

    //埃拉托斯特尼筛法
    public static int countPrimes2(int n) {
        if (n < 2) {
            return 0;
        }
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) {
                count++;
            }
        }
        return count;
    }

    // todo 方法三

    public static void main(String[] args) {
        System.out.println(countPrimes(100));
    }
}
