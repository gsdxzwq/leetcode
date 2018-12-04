package com.zhaowq.leetcode;

/**
 * Middle of the Linked List
 * <p>
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * If there are two middle nodes, return the second middle node.
 * <p>
 * Example 1:
 * Input: [1,2,3,4,5]
 * Output: Node 3 from this list (Serialization: [3,4,5])
 * The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
 * Note that we returned a ListNode object ans, such that:
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 * <p>
 * Example 2:
 * Input: [1,2,3,4,5,6]
 * Output: Node 4 from this list (Serialization: [4,5,6])
 * Since the list has two middle nodes with values 3 and 4, we return the second one.
 * <p>
 * Note:
 * The number of nodes in the given list will be between 1 and 100.
 *
 * @author zhaowq
 * @date 2018/11/30
 */
public class Solution876 {
    /**
     * 我是先算出长度。看Discuss推荐解法是使用快慢指针，一个一次一步，一个一次两步
     */
    public ListNode middleNode(ListNode head) {
        int middle = (getLength(head) + 2) / 2;
        int i = 1;
        while (i < middle) {
            i++;
            head = head.next;
        }
        return head;
    }

    private int getLength(ListNode head) {
        int length = 1;
        while (head.next != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}
