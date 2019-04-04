package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Binary Tree Postorder Traversal
 * <p>
 * Given a binary tree, return the postorder traversal of its nodes' values.
 *
 * @author zhaowq
 * @date 2019/4/4
 */
public class Solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.right != null || node.left != null) {
                stack.push(new TreeNode(node.val));
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            } else {
                result.add(node.val);
            }
        }

        return result;
    }
}
