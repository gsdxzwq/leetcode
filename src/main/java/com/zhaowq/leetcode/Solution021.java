package com.zhaowq.leetcode;

/**
 * Merge Two Sorted Lists
 * <p>
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 *
 * @author zhaowq
 * @date 2019/4/1
 */
public class Solution021 {
    /**
     * 常规解法：遍历
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = null;
        //TODO
        return res;
    }

    /**
     * 递归
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode res = null;
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            if (l1.val < l2.val) {
                res = l1;
                res.next = mergeTwoLists(l1.next, l2);
            } else {
                res = l2;
                res.next = mergeTwoLists(l1, l2.next);
            }
            return res;
        }
    }
}
