package com.zhaowq.leetcode;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Maximum Depth of N-ary Tree
 * <p>
 * Given a n-ary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Note:
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 *
 * @author zhaowq
 * @date 2018/12/3
 */
public class Solution559 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.children == null) {
            return 1;
        }

        return getMax(root.children) + 1;
    }

    private int getMax(List<Node> children) {
        int depth = 0;
        for (Node child : children) {
            depth = Math.max(depth, maxDepth(child));
        }
        return depth;
    }

    /**
     * 官方Solution迭代方式实现
     */
    public int maxDepth2(Node root) {
        Queue<Pair<Node, Integer>> stack = new LinkedList<>();
        if (root != null) {
            stack.add(new Pair(root, 1));
        }

        int depth = 0;
        while (!stack.isEmpty()) {
            Pair<Node, Integer> current = stack.poll();
            root = current.getKey();
            int current_depth = current.getValue();
            if (root != null) {
                depth = Math.max(depth, current_depth);
                for (Node c : root.children) {
                    stack.add(new Pair(c, current_depth + 1));
                }
            }
        }
        return depth;
    }
}
