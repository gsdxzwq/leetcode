package com.zhaowq.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Unique Morse Code Words
 * <p>
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,
 * as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 * <p>
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * <p>
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter.
 * For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-").
 * We'll call such a concatenation, the transformation of a word.
 * <p>
 * Return the number of different transformations among all words we have.
 * <p>
 * Example:
 * Input: words = ["gin", "zen", "gig", "msg"]
 * Output: 2
 * Explanation:
 * The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 * <p>
 * There are 2 different transformations, "--...-." and "--...--.".
 *
 * @author zhaowq
 * @date 2018/10/8
 */
public class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<String>();
        for (String word : words) {
            StringBuilder code = new StringBuilder();
            for (char c : word.toCharArray()) {
                code.append(MORSE[c - 'a']);
            }
            set.add(code.toString());
        }
        return set.size();
    }
}
