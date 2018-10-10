package com.zhaowq.leetcode;

/**
 * Robot Return to Origin
 * <p>
 * There is a robot starting at position (0, 0), the origin, on a 2D plane.
 * Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
 * <p>
 * The move sequence is represented by a string, and the character moves[i] represents its ith move.
 * Valid moves are R (right), L (left), U (up), and D (down).
 * If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.
 * <p>
 * Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once, "L" will always make it move left, etc.
 * Also, assume that the magnitude of the robot's movement is the same for each move.
 * <p>
 * Example 1:
 * Input: "UD"
 * Output: true
 * Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.
 * <p>
 * Example 2:
 * Input: "LL"
 * Output: false
 * Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.
 *
 * @author zhaowq
 * @date 2018/10/9
 */
public class Solution657 {
    public boolean judgeCircle(String moves) {
        int h = 0, v = 0;
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'R':
                    h++;
                    break;
                case 'L':
                    h--;
                    break;
                case 'U':
                    v++;
                    break;
                case 'D':
                    v--;
                    break;
                default:
                    return false;
            }
        }
        return h == 0 && v == 0;
    }
}
