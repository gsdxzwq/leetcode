package com.zhaowq.leetcode;

/**
 * @author zhaowq
 * @date 2024/12/6
 */
public class Solution999 {
    public int numRookCaptures(char[][] board) {
        //白色的车'R'、白色的象'B'、黑色的卒'p'、空方块'.'
        int res = 0;
        int m = 0;
        int n = 0;
        outerLoop:
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    m = i;
                    n = j;
                    break outerLoop;
                }
            }
        }

        // 上
        for (int i = n; i >= 0; i--) {
            if (board[m][i]=='B'){
                break;
            }
            if (board[m][i]=='p'){
                res++;
                break;
            }
        }

        // 下
        for (int i = n; i < 8; i++) {
            if (board[m][i]=='B'){
                break;
            }
            if (board[m][i]=='p'){
                res++;
                break;
            }
        }

        // 左
        for (int i = m; i >= 0; i--) {
            if (board[i][n]=='B'){
                break;
            }
            if (board[i][n]=='p'){
                res++;
                break;
            }
        }

        // 右
        for (int i = m; i <8; i++) {
            if (board[i][n]=='B'){
                break;
            }
            if (board[i][n]=='p'){
                res++;
                break;
            }
        }

        return res;
    }
}
