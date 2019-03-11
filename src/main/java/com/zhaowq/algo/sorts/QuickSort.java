package com.zhaowq.algo.sorts;

/**
 * 5.快速排序
 *
 * @author zhaowq
 * @date 2019/2/18
 */
public class QuickSort {
    public void sort(int[] a) {
        quickSortC(a, 0, a.length - 1);
        for (int num : a) {
            System.out.print(num + "  ");
        }
    }

    /**
     * 快速排序递归函数，p,r 为下标
     */
    private void quickSortC(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }

        // 获取分区点
        int q = partition(a, p, r);
        quickSortC(a, p, q - 1);
        quickSortC(a, q + 1, r);
    }

    private int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i != j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } else {
                    i++;
                }
            }
        }

        int temp = a[i];
        a[i] = a[r];
        a[r] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] a = {11, 8, 3, 9, 7, 1, 2, 5};
        new QuickSort().sort(a);
    }
}
