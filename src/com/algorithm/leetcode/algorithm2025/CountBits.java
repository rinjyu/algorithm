package com.algorithm.leetcode.algorithm2025;

import java.util.Arrays;

public class CountBits {

    public static void main(String[] args) {

        int n = 2;
//        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }

    public static int[] countBits(int n) {

        int[] result = new int[n + 1];
//        for (int i = 0; i <= n; i++) {
//            String binary = Integer.toBinaryString(i);
//            result[i] = binary.length() - binary.replaceAll("1", "").length();
//        }
//
//        return result;

        for (int i = 1; i <= n; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }

        return result;
    }
}
