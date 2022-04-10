package com.algorithm.leetcode.algorithm;

public class SearchMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
//        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
//        int target = 13;
        boolean result = searchMatrix(matrix, target);
        System.out.println(result);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int length = matrix[0].length;
        for (int[] integers : matrix) {
            if (integers[length - 1] >= target) {
                for (int j = 0; j < length; j++) {
                    if (integers[j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
