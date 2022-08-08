package com.algorithm.leetcode.algorithm;

public class DiagonalSum {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] mat = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int result = diagonalSum(mat);
        System.out.println(result);
    }

    public static int diagonalSum(int[][] mat) {
        int result = 0;
        int length = mat.length;
        for (int i = 0; i < length; i++) {
            result += mat[i][i];
            result += mat[length - 1 - i][i];
        }
        return result - (length % 2 == 1 ? mat[length / 2][length / 2] : 0);
    }
}
