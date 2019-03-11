package com.zhaowq.algo.sorts;

/**
 * 3.选择排序
 *
 * @author zhaowq
 * @date 2019/2/18
 */
public class SelectionSort {
    public static int[] sort(int[] a) {
        int length = a.length;
        if (length <= 1) {
            return a;
        }

        for (int i = 0; i < length - 1; i++) {
            //查找未排序区间最小元素
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            //与i位置交换
            if (i != min) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 45, 65, 33, 12};
        System.out.println("交换之前：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        arr = sort(arr);

        System.out.println("交换后：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
