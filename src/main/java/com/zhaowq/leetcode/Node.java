package com.zhaowq.leetcode;

import java.util.List;

/**
 * Definition for a Node.
 *
 * @author zhaowq
 * @date 2018/11/16
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
