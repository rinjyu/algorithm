package com.algorithm.leetcode.algorithm;

public class CountNegatives {

    public static void main(String[] args) {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
//        int[][] grid = {{3, 2}, {1, 0}};
        int result = countNegatives(grid);
        System.out.println(result);
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] nums : grid) {
            for (int n : nums) {
                if (n < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
