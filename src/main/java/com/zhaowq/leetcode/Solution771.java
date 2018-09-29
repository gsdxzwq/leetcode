package com.zhaowq.leetcode;

/**
 * Jewels and Stones
 * <p>
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 * <p>
 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * Note:
 * S and J will consist of letters and have length at most 50.\
 * The characters in J are distinct.
 * <p>
 * Example 1:
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * <p>
 * Example 2:
 * Input: J = "z", S = "ZZ"
 * Output: 0
 *
 * @author zhaowq
 * @date 2018/9/29
 */
public class Solution771 {
    public int numJewelsInStones(String J, String S) {
        int num = 0;
        char[] jewels = J.toCharArray();
        char[] stores = S.toCharArray();
        for (char s : stores) {
            for (char j : jewels) {
                if (s == j) {
                    num += 1;
                    break;
                }
            }
        }
        return num;
    }
}
