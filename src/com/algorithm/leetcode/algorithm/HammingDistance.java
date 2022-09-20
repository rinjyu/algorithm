package com.algorithm.leetcode.algorithm;

public class HammingDistance {

    public static void main(String[] args) {
        int x = 1;
        int y = 4;
//        int x = 3;
//        int y = 1;
        int result = hammingDistance(x, y);
        System.out.println(result);
    }

    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
