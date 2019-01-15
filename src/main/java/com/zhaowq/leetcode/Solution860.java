package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Lemonade Change
 * <p>
 * At a lemonade stand, each lemonade costs $5.
 * Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).
 * Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.
 * You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.
 * Note that you don't have any change in hand at first.
 * Return true if and only if you can provide every customer with correct change.
 * <p>
 * Example 1:
 * Input: [5,5,5,10,20]
 * Output: true
 * Explanation:
 * From the first 3 customers, we collect three $5 bills in order.
 * From the fourth customer, we collect a $10 bill and give back a $5.
 * From the fifth customer, we give a $10 bill and a $5 bill.
 * Since all customers got correct change, we output true.
 * <p>
 * Example 2:
 * Input: [5,5,10]
 * Output: true
 * <p>
 * Example 3:
 * Input: [10,10]
 * Output: false
 * <p>
 * Example 4:
 * Input: [5,5,10,10,20]
 * Output: false
 * Explanation:
 * From the first two customers in order, we collect two $5 bills.
 * For the next two customers in order, we collect a $10 bill and give back a $5 bill.
 * For the last customer, we can't give change of $15 back because we only have two $10 bills.
 * Since not every customer received correct change, the answer is false.
 *
 * @author zhaowq
 * @date 2019/1/7
 */
public class Solution860 {

    /**
     * 直观解法，维护一个钱包，找钱
     * 改进：只用关注5元和10元的数量就行
     */
    public boolean lemonadeChange(int[] bills) {
        List<Integer> list = new ArrayList<>();
        for (int bill : bills) {
            list.add(bill);
            if (bill == 10) {
                if (list.contains(5)) {
                    list.remove(Integer.valueOf(5));
                } else {
                    return false;
                }
            }
            if (bill == 20) {
                if (list.contains(10)) {
                    list.remove(Integer.valueOf(10));
                    if (list.contains(5)) {
                        list.remove(Integer.valueOf(5));
                    } else {
                        return false;
                    }
                } else if (list.contains(5)) {
                    list.remove(Integer.valueOf(5));
                    if (list.contains(5)) {
                        list.remove(Integer.valueOf(5));
                    } else {
                        return false;
                    }
                    if (list.contains(5)) {
                        list.remove(Integer.valueOf(5));
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean lemonadeChange2(int[] bills) {
        int five = 0, ten = 0;
        for (int i : bills) {
            if (i == 5) {
                five++;
            } else if (i == 10) {
                five--;
                ten++;
            } else if (ten > 0) {
                ten--;
                five--;
            } else {
                five -= 3;
            }

            if (five < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Solution860().lemonadeChange(new int[]{5, 5, 10, 10, 20});
    }
}
