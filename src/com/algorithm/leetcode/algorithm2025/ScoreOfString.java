package com.algorithm.leetcode.algorithm2025;

public class ScoreOfString {

    public static void main(String[] args) {
        String s = "hello";
//        String s = "zaz";
        System.out.println(scoreOfString(s));
    }

    public static int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            sum += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return sum;
    }
}
