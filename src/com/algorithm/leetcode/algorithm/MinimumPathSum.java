package com.algorithm.leetcode.algorithm;

public class MinimumPathSum {

    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
//        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
        int result = minPathSum(grid);
        System.out.println(result);
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] result = new int[m][n];
        result[0][0] = grid[0][0];

        for (int i = 1; i < n; i++) {
            result[0][i] = grid[0][i] + result[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            result[i][0] = grid[i][0] + result[i - 1][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = grid[i][j] + Math.min(result[i - 1][j], result[i][j - 1]);
            }
        }
        return result[m - 1][n - 1];
    }
}