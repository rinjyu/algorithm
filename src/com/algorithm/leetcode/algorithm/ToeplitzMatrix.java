package com.algorithm.leetcode.algorithm;

public class ToeplitzMatrix {

    public static void main(String[] args) {
        int[][] maxtrix = {{1, 2, 3, 4}, {5, 1, 2, 3}};
//        int[][] maxtrix = {{1, 2}, {2, 2}};
        boolean result = isToeplitzMatrix(maxtrix);
        System.out.println(result);
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
