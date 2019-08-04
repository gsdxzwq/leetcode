package com.zhaowq.leetcode;

import java.util.LinkedList;

/**
 * Range Sum of BST
 * <p>
 * Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
 * The binary search tree is guaranteed to have unique values.
 *
 * @author zhaowq
 * @date 2019/4/4
 */
public class Solution938 {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;

        //中序遍历
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if (p.val >= L && p.val <= R) {
                sum += p.val;
            }
            p = p.right;
        }

        return sum;
    }
}
