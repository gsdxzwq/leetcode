package com.zhaowq.algo.sorts;

/**
 * 1.冒泡排序
 * 改进：增加flag
 *
 * @author zhaowq
 * @date 2019/2/15
 */
public class BubbleSort {
    public static void sort(int[] a) {
        int length = a.length;
        if (length <= 1) {
            return;
        }

        for (int i = 0; i < length; i++) {
            boolean flag = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 3, 2, 1};
        sort(a);
    }
}
