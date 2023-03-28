package com.algorithm.leetcode.algorithm;

public class GetMaximumGenerated {

    public static void main(String[] args) {
        int n = 7;
//        int n = 2;
//        int n = 3;
        int result = getMaximumGenerated(n);
        System.out.println(result);
    }

    public static int getMaximumGenerated(int n) {
        int[] arr = new int[n + 1];
        int result = 0;

        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i / 2];
            } else {
                arr[i] = arr[i / 2] + arr[i / 2 + 1];
            }
            result = Math.max(result, arr[i]);
        }
        return result;
    }
}
