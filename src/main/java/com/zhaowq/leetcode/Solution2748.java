package com.zhaowq.leetcode;

/**
 * @author zhaowq
 * @date 2024/11/14
 */
public class Solution2748 {
    public int countBeautifulPairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (gcd(getFirstDigit(nums[i]), getLastDigit(nums[j])) == 1) {
                    res++;
                }
            }
        }
        return res;
    }

    private int getFirstDigit(int number) {
        // 将数字转换为字符串并获取第一个字符
        String numStr = Integer.toString(number);
        char firstChar = numStr.charAt(0);
        // 将字符转换为整数
        return Character.getNumericValue(firstChar);
    }

    private int getLastDigit(int number) {
        // 将数字转换为字符串并获取最后一个字符
        String numStr = Integer.toString(number);
        char lastChar = numStr.charAt(numStr.length() - 1);
        // 将字符转换为整数
        return Character.getNumericValue(lastChar);
    }

    // 使用欧几里得算法计算最大公约数
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
