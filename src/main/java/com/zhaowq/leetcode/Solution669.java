package com.zhaowq.leetcode;

/**
 * Trim a Binary Search Tree
 * Given a binary search tree and the lowest and highest boundaries as L and R,
 * trim the tree so that all its elements lies in [L, R] (R >= L).
 * You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.
 *
 * @author zhaowq
 * @date 2018/12/13
 */
public class Solution669 {

    /**
     * 自己实现第一版，报NPE
     */
    public static TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }

        if (root.val < L) {
            root = root.right;
        } else if (root.val > R) {
            root = root.left;
        } else {
            trimBST(root.left, L, R);
            trimBST(root.right, L, R);
        }
        return root;
    }

    /**
     * 自己实现第二版，输出错误结果
     */
    public static TreeNode trimBST2(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }

        if (root.val < L) {
            root = root.right;
        } else if (root.val > R) {
            root = root.left;
        } else {
            root.left = trimBST2(root.left, L, R);
            root.right = trimBST2(root.right, L, R);
        }
        return root;
    }

    /**
     * 参考Solution，终于成功了
     */
    public static TreeNode trimBST3(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }

        if (root.val < L) {
            root = trimBST3(root.right, L, R);
        } else if (root.val > R) {
            root = trimBST3(root.left, L, R);
        } else {
            root.left = trimBST3(root.left, L, R);
            root.right = trimBST3(root.right, L, R);
        }
        return root;
    }
}
