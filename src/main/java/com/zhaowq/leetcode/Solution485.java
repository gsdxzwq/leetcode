package com.zhaowq.leetcode;

/**
 * Max Consecutive Ones
 * <p>
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * <p>
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * <p>
 * Note:
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 *
 * @author zhaowq
 * @date 2018/12/24
 */
public class Solution485 {

    /**
     * record没必要定义为数组，int就可以，因为只有record[i-1]的值有用。
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] record = new int[nums.length];
        record[0] = nums[0] == 1 ? 1 : 0;
        int max = nums[0] == 1 ? 1 : 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (nums[i] == nums[i - 1]) {
                    record[i] = record[i - 1] + 1;
                } else {
                    record[i] = 1;
                }
            } else {
                record[i] = 0;
            }

            if (max < record[i]) {
                max = record[i];
            }
        }
        return max;
    }

    /**
     * record定义为int，然而花费时间还是11ms。
     * 可以利用nums取值只有0和1的特性。
     */
    public int findMaxConsecutiveOnes2(int[] nums) {
        int max = nums[0] == 1 ? 1 : 0;
        int record = max;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (nums[i] == nums[i - 1]) {
                    record = record + 1;
                } else {
                    record = 1;
                }
            } else {
                record = 0;
            }

            max = Math.max(max, record);
        }
        return max;
    }

    /**
     * 利用nums取值只有0和1的特性。
     * 当nums[i - 1]= 0，则record = 0， 加一后为1；
     * 当nums[i - 1]= 1，则加1；
     * 所以可以不用管nums[i-1]的取值，当num[i] = 1直接加1；
     * 即record = nums[i] == 0 ? 0 : record + 1；
     * i从0开始，max和record初始化也可以简化。
     */
    public int findMaxConsecutiveOnes3(int[] nums) {
        int max = 0;
        int record = 0;
        for (int num : nums) {
            record = num == 0 ? 0 : record + 1;
            max = Math.max(max, record);
        }
        return max;
    }
}
