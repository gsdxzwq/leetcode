package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Binary Tree Preorder Traversal
 * <p>
 * Given a binary tree, return the preorder traversal of its nodes' values.
 *
 * @author zhaowq
 * @date 2019/4/4
 */
public class Solution144 {

    /**
     * 递归
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        recursive(root, result);
        return result;
    }

    private void recursive(TreeNode node, List<Integer> list) {
        list.add(node.val);
        if (node.left!=null){
            recursive(node.left, list);
        }
        if (node.right!=null){
            recursive(node.right, list);
        }
    }

    /**
     * 迭代
     */
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right!=null){
                stack.push(node.right);
            }
            if (node.left!=null){
                stack.push(node.left);
            }
        }

        return result;
    }
}
