package com.algorithm.leetcode.algorithm;

public class JudgeCircle {

    public static void main(String[] args) {
        String movies = "UD";
//        String movies = "LL";
        boolean result = judgeCircle(movies);
        System.out.println(result);
    }

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    y--;
                    break;
                case 'D':
                    y++;
                    break;
                case 'L':
                    x--;
                    break;
                default:
                    x++;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
