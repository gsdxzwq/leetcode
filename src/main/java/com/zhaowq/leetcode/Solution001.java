package com.zhaowq.leetcode;

import java.util.HashMap;

/**
 * @ClassName: Ques001
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaowq
 * @date 2016年1月3日下午7:48:58
 *
 */
public class Solution001 {
	public int[] twoSum(int[] nums, int target) {
		int[] results = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					results[0] = nums[i];
					results[1] = nums[j];
				}
			}
		}

		return results;
	}

	//时间复杂度为O(n)
	public int[] twoSum2(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int index = map.get(nums[i]);
				result[0] = index + 1;
				result[1] = i + 1;
				break;
			} else {
				map.put(target - nums[i], i);
			}
		}
		return result;
	}
}
