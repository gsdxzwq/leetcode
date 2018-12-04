package com.zhaowq.leetcode;

/**
 * Add Two Numbers
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * @author zhaowq
 * @date 2016/1/3
 */
public class Solution002 {

    /**
     * 网络答案
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int d1 = l1 == null ? 0 : l1.val;
            int d2 = l2 == null ? 0 : l2.val;
            int sum = d1 + d2 + carry;
            carry = sum >= 10 ? 1 : 0;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry == 1) {
            cur.next = new ListNode(1);
        }
        return dummy.next;
    }

    /**
     * 自己写法，不知道怎么开启循环
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode output = new ListNode(l1.val + l2.val);
        int into = 0;
        if (null != l1.next) {
            output.next = new ListNode(0);
            int count = l1.next.val + l2.next.val;

            if (into == 1) {
                output.next.val += 1;
            }
            if (count > 9) {
                output.next.val = count % 10;
                into = 1;
            } else {
                output.next.val = count;
                into = 0;
            }
        }
        return output;
    }
}
