package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Sol412 {
	public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
		for (int i = 1; i < n + 1; i++) {
			if (i % 15 == 0) {
				list.add("FizzBuzz");
				continue;
			}
			if (i % 3 == 0) {
				list.add("Fizz");
				continue;
			}
			if (i % 5 == 0) {
				list.add("Buzz");
				continue;
			}
			list.add(String.valueOf(i));
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(fizzBuzz(16));
	}
}
