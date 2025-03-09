package com.zhaowq.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaowq
 * @date 2024/12/18
 */
public class Solution2325 {
    public String decodeMessage(String key, String message) {
        Map<Character, Integer> map = new HashMap<>();
        int serial = 0;
        for (Character character : key.toCharArray()) {
            if (character != ' ' && !map.containsKey(character)) {
                map.put(character, serial++);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : message.toCharArray()) {
            if (character == ' ') {
                stringBuilder.append(' ');
            } else {
                stringBuilder.append((char) (map.get(character) + 'a'));
            }
        }
        return stringBuilder.toString();
    }
}
