package com.zhaowq.leetcode;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;

/**
 * @author zhaowq
 * @date 2019/1/16
 */
public class Solution783 {
    public int minDiffInBST(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        int dis = Integer.MAX_VALUE;
        queue.add(root);
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.getLast();
                dis = calMinDis(node, queue, dis);
            }
        }
        return dis;
    }

    private int calMinDis(TreeNode root, LinkedList<TreeNode> queue, int dis) {
        if (root.left != null) {
            dis = Math.min(root.val - root.left.val, dis);
            queue.add(root.left);
        }
        if (root.right != null) {
            dis = Math.min(root.right.val - root.val, dis);
            queue.add(root.right);
        }
        return dis;
    }
}
