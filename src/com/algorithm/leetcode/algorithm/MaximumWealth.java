package com.algorithm.leetcode.algorithm;

public class MaximumWealth {

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
//        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
//        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int result = maximumWealth(accounts);
        System.out.println(result);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i = 0; i < account.length; i++) {
                sum += account[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
