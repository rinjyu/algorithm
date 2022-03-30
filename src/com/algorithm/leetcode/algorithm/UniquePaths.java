package com.algorithm.leetcode.algorithm;

public class UniquePaths {

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
//        int m = 3;
//        int n = 2;
        int result = uniquePaths(m, n);
        System.out.println(result);
    }

    public static int uniquePaths(int m, int n) {
        if (isValidNumber(m)) {
            return -1;
        }
        if (isValidNumber(n)) {
            return -1;
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = result[i - 1][j] + result[i][j - 1];
                }
            }

        }
        return result[m - 1][n - 1];
    }

    private static boolean isValidNumber(int number) {
        return number < 1 || number > 100;
    }
}