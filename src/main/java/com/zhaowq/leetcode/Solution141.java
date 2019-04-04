package com.zhaowq.leetcode;

/**
 * Linked List Cycle
 * <p>
 * Given a linked list, determine if it has a cycle in it.
 *
 * @author zhaowq
 * @date 2019/3/29
 */
public class Solution141 {

    /**
     * 常规解法：快慢指针
     */
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (slow!=null&& fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
