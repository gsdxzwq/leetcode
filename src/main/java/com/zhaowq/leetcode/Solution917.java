package com.zhaowq.leetcode;

/**
 * Reverse Only Letters
 * <p>
 * Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place,
 * and all letters reverse their positions.
 * <p>
 * Example 1:
 * Input: "ab-cd"
 * Output: "dc-ba"
 * <p>
 * Example 2:
 * Input: "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 * <p>
 * Example 3:
 * Input: "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 * <p>
 * Note:
 * S.length <= 100
 * 33 <= S[i].ASCIIcode <= 122
 * S doesn't contain \ or "
 *
 * @author zhaowq
 * @date 2018/12/21
 */
public class Solution917 {
    public String reverseOnlyLetters(String S) {
        int length = S.length();

        char[] result = new char[length];

        int i = 0;
        int j = length - 1;
        while (i <= j) {
            if (!isLetter(S.charAt(i))) {
                result[i] = S.charAt(i);
                i++;
                continue;
            }

            if (!isLetter(S.charAt(j))) {
                result[j] = S.charAt(j);
                j--;
                continue;
            }

            result[i] = S.charAt(j);
            result[j] = S.charAt(i);
            i++;
            j--;
        }

        return String.valueOf(result);
    }

    /**
     * 可直接调用Character.isLetter()
     */
    private boolean isLetter(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }
}
