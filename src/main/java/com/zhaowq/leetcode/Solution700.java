package com.zhaowq.leetcode;

/**
 * Search in a Binary Search Tree
 * <p>
 * Given the root node of a binary search tree (BST) and a value.
 * You need to find the node in the BST that the node's value equals the given value.
 * Return the subtree rooted with that node.
 * If such node doesn't exist, you should return NULL.
 *
 * @author zhaowq
 * @date 2018/11/30
 */
public class Solution700 {
    /**
     * BST中序遍历有序，需利用这个特点
     * 迭代实现版本
     */
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }
}
