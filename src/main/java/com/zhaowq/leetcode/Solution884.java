package com.zhaowq.leetcode;

import java.util.*;

/**
 * Uncommon Words from Two Sentences
 * <p>
 * We are given two sentences A and B.
 * (A sentence is a string of space separated words. Each word consists only of lowercase letters.)
 * <p>
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 * Return a list of all uncommon words.
 * You may return the list in any order.
 * <p>
 * Example 1:
 * Input: A = "this apple is sweet", B = "this apple is sour"
 * Output: ["sweet","sour"]
 * <p>
 * Example 2:
 * Input: A = "apple apple", B = "banana"
 * Output: ["banana"]
 * <p>
 * Note:
 * 0 <= A.length <= 200
 * 0 <= B.length <= 200
 * A and B both contain only spaces and lowercase letters.
 *
 * @author zhaowq
 * @date 2018/12/13
 */
public class Solution884 {

    /**
     * 优化：可以直接split字符串（A + " " + B）。
     */
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        String[] splitA = A.split(" ");
        for (String a : splitA) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        String[] splitB = B.split(" ");
        for (String b : splitB) {
            map.put(b, map.getOrDefault(b, 0) + 1);
        }

        Set<String> set = new HashSet<>();
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                set.add(key);
            }
        }
        return set.toArray(new String[set.size()]);
    }
}
