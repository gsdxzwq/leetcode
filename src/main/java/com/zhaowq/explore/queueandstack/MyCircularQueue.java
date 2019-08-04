package com.zhaowq.explore.queueandstack;

/**
 * @author zhaowq
 * @date 2018/12/18
 */
class MyCircularQueue {
    Integer[] queue;
    int head;
    int tail;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        queue = new Integer[k];
        head = -1;
        tail = -1;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (!isFull()) {
            if (head == -1) {
                head = 0;
            }

            if (tail == queue.length - 1) {
                tail = -1;
            }

            queue[++tail] = value;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (!isEmpty()) {
            queue[head] = null;

            if (isEmpty()) {
                head = -1;
                tail = -1;
            } else {
                head++;
            }

            return true;
        } else {
            return false;
        }
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        return isEmpty() ? -1 : queue[head];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        return isEmpty() ? -1 : queue[tail];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return head == -1 || (head == tail && queue[head] == null);
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return (head == 0 && tail == queue.length - 1) || (tail + 1 == head);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
