package com.algorithm.leetcode.algorithm;

public class OddCells {

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0, 1}, {1, 1}};
//        int m = 2;
//        int n = 2;
//        int[][] indices = {{1, 1}, {0, 0}};

    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int[] array : indices) {
            for (int i = 0; i < n; i++) {
                matrix[array[0]][i]++;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][array[1]]++;
            }
        }
        int result = 0;
        for (int[] array : matrix) {
            for (int num : array) {
                if (num % 2 != 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
