package com.zhaowq.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Solution003
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaowq
 * @date 2016年1月5日下午9:22:53
 *
 */
public class Solution003 {
	public int lengthOfLongestSubstring(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int length = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				int last = map.get(ch);
				map.put(ch, i);
				if (i - last > length) {
					length = i - last;
				}
			} else {
				map.put(ch, i);
			}

		}
		return length;
	}
}
