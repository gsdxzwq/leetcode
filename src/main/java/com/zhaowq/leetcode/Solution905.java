package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Sort Array By Parity
 * <p>
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 * You may return any answer array that satisfies this condition.
 * <p>
 * Example 1:
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 * @author zhaowq
 * @date 2018/10/8
 */
public class Solution905 {
    /**
     * 可以不开辟新空间，两头两个指针往中间走，具体怎么编程？
     */
    public int[] sortArrayByParity(int[] A) {
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        for (int a :A){
            if (a%2==0){
                even.add(a);
            }else {
                odd.add(a);
            }
        }
        even.addAll(odd);

        int[] result = new int[even.size()];
        for(int i = 0;i<even.size();i++){
            result[i] = even.get(i);
        }
        return result;
    }
}
