package com.zhaowq.leetcode;

/**
 * Detect Capital
 * <p>
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * 1.All letters in this word are capitals, like "USA".
 * 2.All letters in this word are not capitals, like "leetcode".
 * 3.Only the first letter in this word is capital if it has more than one letter, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 * <p>
 * Example 1:
 * Input: "USA"
 * Output: True
 * <p>
 * Example 2:
 * Input: "FlaG"
 * Output: False
 * <p>
 * Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 *
 * @author zhaowq
 * @date 2018/12/27
 */
public class Solution520 {

    /**
     * 参考的discuss。
     * 这种解法需先遍历一次，有没有在遍历中就return false的解法？
     */
    public boolean detectCapitalUse(String word) {
        int cnt = 0;
        for (char c : word.toCharArray()) {
            if ('Z' - c >= 0) {
                cnt++;
            }
        }
        return ((cnt == 0 || cnt == word.length()) || (cnt == 1 && 'Z' - word.charAt(0) >= 0));
    }
}
