package com.zhaowq.leetcode;

/**
 * Remove Nth Node From End of List
 * <p>
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * <p>
 * Example:
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * <p>
 * Note:
 * Given n will always be valid.
 * <p>
 * Follow up:
 * Could you do this in one pass?
 *
 * @author zhaowq
 * @date 2019/3/29
 */
public class Solution019 {
    /**
     * 两次遍历法
     * 无法验证正确性，Time Limit Exceeded
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //1.计算单链表长度
        int length = 0;
        if (head != null) {
            length = 1;
            ListNode temp = head;
            while (temp.next != null) {
                length++;
                temp = head.next;
            }
        }

        //2.删除位置
        int location = length + 1 - n;

        //3.删除
        while (head.next != null) {
            location--;
            if (location == 0) {
                head.next = head.next.next;
                break;
            }
            head = head.next;
        }
        return head;
    }

    int num = -1;

    /**
     * 递归法
     * 该方法返回倒数第K个节点 未删除
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        if (num == -1) {
            num = n;
        }
        if (null == head) {
            return null;
        }

        ListNode temp = removeNthFromEnd2(head.next, n);
        if (temp != null) {
            return temp;
        } else {
            // 递归返回一次，num值减1
            num--;
            if (num == 0) {
                //返回倒数第K个节点
                return head;
            }
            return null;
        }
    }

    /**
     * 双指针法
     */
    public ListNode removeNthFromEnd3(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p1 = dummy;
        ListNode p2 = dummy;

        //1.p1 前进 K 个节点，则 p1 与 p2 相距 K 个节点
        for (int i = 0; i <= n; i++) {
            p1 = p1.next;
        }

        //2.p1，p2 同时前进，每次前进 1 个节点。当 p1 指向到达链表末尾，由于 p1 与 p2 相距 K 个节点，则 p2 指向目标节点。
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        //3.删除
        p2.next = p2.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);

        ListNode node4 = new ListNode(4);
        node4.next = node5;

        ListNode node3 = new ListNode(3);
        node3.next = node4;

        ListNode node2 = new ListNode(2);
        node2.next = node3;

        ListNode node1 = new ListNode(1);
        node1.next = node2;

        ListNode result = new Solution019().removeNthFromEnd3(node1, 2);
        System.out.println(result.val);
    }
}
