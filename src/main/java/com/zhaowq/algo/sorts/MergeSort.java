package com.zhaowq.algo.sorts;

/**
 * 4.归并排序
 *
 * @author zhaowq
 * @date 2019/2/15
 */
public class MergeSort {
    public void sort(int[] a) {
        int length = a.length;
        mergeSortC(a, 0, length - 1);

        for (int num : a) {
            System.out.print(num + "  ");
        }
    }

    /**
     * 递归调用函数
     */
    private void mergeSortC(int[] a, int p, int r) {
        // 递归终止条件
        if (p >= r) {
            return;
        }

        // 取p到r之间的中间位置q
        int q = (p + r) / 2;

        // 分治递归
        mergeSortC(a, p, q);
        mergeSortC(a, q + 1, r);
        // 将 a[p...q] 和 a[q+1...r] 合并为 a[p...r]
        merge(a, p, q, r);
    }

    private void merge(int[] a, int p, int q, int r) {
        // 初始化变量 i, j, k
        int i = p, j = q + 1, k = 0;
        // 申请一个大小跟 a[p...r] 一样的临时数组
        int[] tmp = new int[r - p + 1];
        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                // i++ 等于 i:=i+1
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }

        // 判断哪个子数组中有剩余的数据
        int start = i, end = q;
        if (j <= r) {
            start = j;
            end = r;
        }

        // 将剩余的数据拷贝到临时数组 tmp
        while (start <= end) {
            tmp[k++] = a[start++];
        }

        // 将 tmp 中的数组拷贝回 a[p...r]
        for (i = 0; i <= r-p; ++i) {
            a[p+i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {11, 8, 3, 9, 7, 1, 2, 5};
        new MergeSort().sort(a);
    }
}
