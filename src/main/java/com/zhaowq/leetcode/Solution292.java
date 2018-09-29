package com.zhaowq.leetcode;

public class Solution292 {
	public boolean canWinNim(int n) {
		int a = 0, b = 0, c = 0;
		n = a + 2 * b + 3 * c;
		if ((a + b + c) % 2 == 0) {
			return true;
		}
		return false;
	}
}
