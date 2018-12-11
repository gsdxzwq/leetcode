package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Leaf-Similar Trees
 * <p>
 * Consider all the leaves of a binary tree.
 * From left to right order, the values of those leaves form a leaf value sequence.
 * <p>
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 *
 * @author zhaowq
 * @date 2018/12/6
 */
public class Solution872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        dfs(root1, list1);
        dfs(root2, list2);
        return list1.equals(list2);
    }

    private void dfs(TreeNode root, List<Integer> leafList) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                leafList.add(root.val);
            }
            dfs(root.left, leafList);
            dfs(root.right, leafList);
        }
    }
}
