package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
        for (int[] integer : matrix) {
            System.out.println(Arrays.toString(integer));
        }
    }

    public static void setZeroes(int[][] matrix) {
        if (!isValidArray(matrix)) {
            return;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        if (!isValidArrayLength(m)) {
            return;
        }
        if (!isValidArrayLength(n)) {
            return;
        }
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row.contains(i) || col.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static boolean isValidArray(int[][] matrix) {
        return !Objects.isNull(matrix);
    }

    private static boolean isValidArrayLength(int length) {
        return length >= 1 && length <= 200;
    }
}