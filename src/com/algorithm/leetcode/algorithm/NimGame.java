package com.algorithm.leetcode.algorithm;

public class NimGame {

    public static void main(String[] args) {
        int n = 4;
//        int n = 1;
//        int n = 2;
        boolean result = canWinNim(n);
        System.out.println(result);
    }

    public static boolean canWinNim(int n) {
        return (n % 4 != 0);
    }
}
