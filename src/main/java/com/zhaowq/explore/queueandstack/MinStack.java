package com.zhaowq.explore.queueandstack;

import java.util.LinkedList;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 *
 * @author zhaowq
 * @date 2018/12/26
 */

public class MinStack {
    LinkedList<Integer> stack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new LinkedList<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return 0;
    }
}
