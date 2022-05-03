package com.algorithm.leetcode.algorithm;

public class UniqueBinarySearchTrees2 {

    public static void main(String[] args) {
//        int n = 3;
        int n = 1;
        int result = numTrees(n);
        System.out.println(result);
    }

    public static int numTrees(int n) {
        if (!isValidNumber(n)) {
            return -1;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        for (int i = 1; i <= n; i++) {
            result[i] = 0;
            for (int j = 0; j < i; j++) {
                result[i] += result[j] * result[i - 1 - j];
            }
        }
        return result[n];
    }

    private static boolean isValidNumber(int n) {
        return n >= 1 && n <= 19;
    }
}
