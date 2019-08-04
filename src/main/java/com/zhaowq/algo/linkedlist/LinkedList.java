package com.zhaowq.algo.linkedlist;

/**
 * 单链表相关算法题目
 *
 * @author zhaowq
 * @date 2019/3/29
 */
public class LinkedList {

    /**
     * 使用链表实现大数加法
     */
    ListNode numberAddAsList(ListNode l1, ListNode l2) {
        ListNode ret = l1, pre = l1;
        int up = 0;
        while (l1 != null && l2 != null) {
            //数值相加
            l1.val = l1.val + l2.val + up;
            //计算是否有进位
            up = l1.val / 10;
            //保留计算结果的个位
            l1.val %= 10;
            //记录当前节点位置
            pre = l1;
            //同时向后移位
            l1 = l1.next;
            l2 = l2.next;
        }
        //若l1到达末尾，说明l1长度小于l2
        if (l1 == null) {
            //pre.next指向l2的当前位置
            pre.next = l2;
        }
        //l1指针指向l2节点当前位置
        l1 = pre.next;
        //继续计算剩余节点
        while (l1 != null) {
            l1.val = l1.val + up;
            up = l1.val / 10;
            l1.val %= 10;
            pre = l1;
            l1 = l1.next;
        }

        //最高位计算有进位，则新建一个节点保留最高位
        if (up != 0) {
            ListNode tmp = new ListNode(up);
            pre.next = tmp;
        }
        //返回计算结果链表
        return ret;
    }
}
