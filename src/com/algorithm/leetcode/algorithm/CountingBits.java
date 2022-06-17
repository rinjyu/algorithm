package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class CountingBits {

    public static void main(String[] args) {
        int n = 2;
//        int n = 5;
        int[] result = countBits(n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = Integer.bitCount(i);
        }
        return result;
    }
}
