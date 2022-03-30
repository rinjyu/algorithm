package com.algorithm.leetcode.algorithm;

public class UniquePaths2 {

    public static void main(String[] args) {
//        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] obstacleGrid = {{0, 1}, {0, 0}};
        int result = uniquePathsWithObstacles(obstacleGrid);
        System.out.println(result);
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (isValidNumber(m)) {
            return 0;
        }
        if (isValidNumber(n)) {
            return 0;
        }
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            result[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            result[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = (obstacleGrid[i][j] == 1) ? 0 : (result[i][j - 1] + result[i - 1][j]);
            }
        }
        return result[m - 1][n - 1];
    }

    private static boolean isValidNumber(int number) {
        return number < 1 || number > 100;
    }
}