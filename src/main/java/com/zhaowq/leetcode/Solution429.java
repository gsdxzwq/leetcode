package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * N-ary Tree Level Order Traversal
 * <p>
 * Given an n-ary tree, return the level order traversal of its nodes' values.
 * (ie, from left to right, level by level).
 *
 * @author zhaowq
 * @date 2018/12/17
 */
public class Solution429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root != null) {
            LinkedList<Node> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int count = queue.size();
                List<Integer> levelList = new ArrayList<>();
                for (int i = 0; i < count; i++) {
                    Node node = queue.poll();
                    levelList.add(node.val);
                    if (node.children != null) {
                        queue.addAll(node.children);
                    }
                }
                result.add(levelList);
            }
        }
        return result;
    }
}
