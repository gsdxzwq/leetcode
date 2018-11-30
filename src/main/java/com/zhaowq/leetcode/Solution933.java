package com.zhaowq.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Number of Recent Calls
 * <p>
 * Write a class RecentCounter to count recent requests.
 * It has only one method: ping(int t), where t represents some time in milliseconds.
 * Return the number of pings that have been made from 3000 milliseconds ago until now.
 * Any ping with time in [t - 3000, t] will count, including the current ping.
 * It is guaranteed that every call to ping uses a strictly larger value of t than before.
 * <p>
 * Example 1:
 * Input: inputs = ["RecentCounter","ping","ping","ping","ping"], inputs = [[],[1],[100],[3001],[3002]]
 * Output: [null,1,2,3,3]
 *
 * @author zhaowq
 * @date 2018/11/14
 */
public class Solution933 {
    Queue<Integer> q;

    public Solution933() {
        q = new LinkedList<>();
    }

    /**
     * 没啥思路，参考的Solution
     */
    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
}
