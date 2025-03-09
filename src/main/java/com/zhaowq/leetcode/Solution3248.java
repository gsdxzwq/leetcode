package com.zhaowq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaowq
 * @date 2024/11/22
 */
public class Solution3248 {
    public static int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;
        for (String command : commands) {
            switch (command) {
                case "UP":
                    j--;
                    break;
                case "RIGHT":
                    i++;
                    break;
                case "DOWN":
                    j++;
                    break;
                case "LEFT":
                    i--;
                    break;
            }
        }
        return (i * n) + j;
    }

    public static void main(String[] args) {
        List<String> commands = new ArrayList<>();
        commands.add("DOWN");
        commands.add("RIGHT");
        commands.add("UP");
        System.out.println(finalPositionOfSnake(3, commands));
    }
}
