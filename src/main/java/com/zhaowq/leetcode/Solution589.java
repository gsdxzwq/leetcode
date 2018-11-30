package com.zhaowq.leetcode;

import java.util.*;

/**
 * N-ary Tree Preorder Traversal
 * <p>
 * Given an n-ary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Note:
 * Recursive solution is trivial, could you do it iteratively?
 *
 * @author zhaowq
 * @date 2018/11/6
 */
public class Solution589 {

    /**
     * 1.递归
     */
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        recursive(root, result);
        return result;
    }

    private void recursive(Node root, List<Integer> list) {
        if (null != root) {
            list.add(root.val);
            for (Node child : root.children) {
                recursive(child, list);
            }
        }
    }

    /**
     * 2.迭代，需借助栈
     */
    public List<Integer> preorder2(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.add(node.val);
            Collections.reverse(node.children);
            stack.addAll(node.children);
        }
        return output;
    }
}
