package com.algorithm.leetcode.algorithm;

public class NumberOfMatches {

    public static void main(String[] args) {
        int n = 7;
//        int n = 14;
        int result = numberOfMatches(n);
        System.out.println(result);
    }

    public static int numberOfMatches(int n) {
        return n - 1;
    }
}
