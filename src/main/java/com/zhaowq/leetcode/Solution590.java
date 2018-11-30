package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * N-ary Tree Postorder Traversal
 * <p>
 * Given an n-ary tree, return the postorder traversal of its nodes' values.
 *
 * @author zhaowq
 * @date 2018/11/16
 */
public class Solution590 {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        if (root != null){
            stack.push(root);
        }

        while (!stack.empty()) {
            Node node = stack.pop();
            result.add(node.val);
            List<Node> children = node.children;
            if (children != null){
                for (Node child: children){
                    stack.push(child);
                }
            }
        }

        Collections.reverse(result);

        return result;
    }
}
