package com.zhaowq.leetcode;

import javafx.util.Pair;

import java.util.*;

/**
 * Average of Levels in Binary Tree
 * <p>
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 * <p>
 * Example 1:
 * Input:
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * Output: [3, 14.5, 11]
 * Explanation:
 * The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 *
 * @author zhaowq
 * @date 2018/12/14
 */
public class Solution637 {
    public List<Double> averageOfLevels(TreeNode root) {
        LinkedList<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        if (root != null) {
            stack.add(new Pair<>(root, 1));
        }

        Map<Integer, List<Integer>> map = new TreeMap<>();
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> pair = stack.pollLast();
            root = pair.getKey();
            int currentDepth = pair.getValue();
            if (root != null) {
                if (map.containsKey(currentDepth)) {
                    List<Integer> list = map.get(currentDepth);
                    list.add(root.val);
                    map.put(currentDepth, list);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(root.val);
                    map.put(currentDepth, list);
                }
                stack.add(new Pair<>(root.left, currentDepth + 1));
                stack.add(new Pair<>(root.right, currentDepth + 1));
            }
        }

        List<Double> result = new ArrayList<>();
        for (Integer key : map.keySet()) {
            Double average = map.get(key).stream().mapToInt((x) -> x).average().getAsDouble();
            result.add(average);
        }

        return result;
    }
}
