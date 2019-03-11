package com.zhaowq.algo.sorts;

/**
 * 2.插入排序
 * 常见实现方法：保存待排序元素，从后往前比较依次后移
 *
 * @author zhaowq
 * @date 2019/2/18
 */
public class InsertionSort {
    public void sort(int[] a) {
        int length = a.length;
        if (length <= 1) {
            return;
        }

        for (int i = 1; i < length; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }
}
