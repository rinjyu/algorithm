package com.algorithm.leetcode.algorithm;

public class DivisorGame {

    public static void main(String[] args) {
        int n = 2;
//        int n = 3;
        boolean result = divisorGame(n);
        System.out.println(result);
    }

    public static boolean divisorGame(int n) {
        return n % 2 == 0;
    }
}
