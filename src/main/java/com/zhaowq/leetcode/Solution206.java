package com.zhaowq.leetcode;

import java.util.LinkedList;

/**
 * Reverse Linked List
 * <p>
 * Reverse a singly linked list.
 * <p>
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * <p>
 * Follow up:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 * @author zhaowq
 * @date 2019/1/7
 */
public class Solution206 {

    /**
     * 尝试迭代，借助了额外空间
     * 验证太慢，只超过了4%
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        LinkedList<Integer> list = new LinkedList<>();
        list.push(head.val);
        while (head.next != null) {
            head = head.next;
            list.push(head.val);
        }

        ListNode result = new ListNode(list.removeLast());
        while (!list.isEmpty()) {
            ListNode temp = new ListNode(list.removeLast());
            temp.next = result;
            result = temp;
        }

        return result;
    }

    /**
     * 迭代，官方Solution
     */
    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
