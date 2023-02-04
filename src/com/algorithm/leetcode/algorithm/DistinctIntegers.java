package com.algorithm.leetcode.algorithm;

public class DistinctIntegers {

    public static void main(String[] args) {
        int n = 5;
//        int n = 3;
        int result = distinctIntegers(n);
        System.out.println(result);
    }

    public static int distinctIntegers(int n) {
        return Math.max(n - 1, 1);
    }
}
