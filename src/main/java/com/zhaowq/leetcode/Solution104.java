package com.zhaowq.leetcode;

import javafx.util.Pair;

import java.util.LinkedList;

/**
 * Maximum Depth of Binary Tree
 * <p>
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Example:
 * Given binary tree [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its depth = 3.
 *
 * @author zhaowq
 * @date 2018/12/14
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }

    /**
     * Iteration，参考Solution
     */
    public int maxDepth2(TreeNode root) {
        LinkedList<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        if (root != null) {
            stack.add(new Pair(root, 1));
        }
        int depth = 0;
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> pair = stack.pollLast();
            root = pair.getKey();
            int currentDepth = pair.getValue();
            if (root != null) {
                depth = Math.max(depth, currentDepth);
                stack.add(new Pair<>(root.left, currentDepth + 1));
                stack.add(new Pair<>(root.right, currentDepth + 1));
            }
        }
        return depth;
    }
}
