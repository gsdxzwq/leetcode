package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Minimum Distance Between BST Nodes
 * <p>
 * Given a Binary Search Tree (BST) with the root node root, return the minimum difference between the values of any two different nodes in the tree.
 *
 * @author zhaowq
 * @date 2019/1/16
 */
public class Solution783 {

    /**
     * 任意两个节点最小差值，根据BST特性，只要中序遍历比较就行
     */
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        //中序遍历
        recursive(root, list);

        //遍历计算
        int minDis = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            minDis = Math.min(minDis, list.get(i + 1) - list.get(i));
        }
        return minDis;
    }

    private void recursive(TreeNode node, List<Integer> list) {
        if (node != null) {
            recursive(node.left, list);
            list.add(node.val);
            recursive(node.right, list);
        }
    }
}
