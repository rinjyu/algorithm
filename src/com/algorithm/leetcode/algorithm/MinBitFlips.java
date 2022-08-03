package com.algorithm.leetcode.algorithm;

public class MinBitFlips {

    public static void main(String[] args) {
        int start = 10;
        int goal = 7;
//        int start = 3;
//        int goal = 4;
        int result = minBitFlips(start, goal);
        System.out.println(result);
    }

    public static int minBitFlips(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }
}
